import java.util.Scanner;
class Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];  
        int n = 0;     
        int choice;

        do
        {
            System.out.println("\n -------- Menu ------");
            System.out.println("1.Insert elements into array");
            System.out.println("2. Display array");
            System.out.println("3. Find sum of all elements");
            System.out.println("4. Find largest element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("How much element");
                    n = sc.nextInt();
                    
                    for (int i = 0; i < n; i++)
                    {
                        arr[i] = sc.nextInt();
						System.out.println("Enter elements:");
                    }
                    break;

                case 2:
                    if (n == 0)
                    {
                        System.out.println("Array is empty");
                    }
                    else
                    {
                        System.out.println("Array elements:");
                        for (int i = 0; i < n; i++)
                        {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int sum = 0;
                    for (int i = 0; i < n; i++)
                    {
                        sum += arr[i];
                    }
                    System.out.println("Sum of element = " + sum);
                    break;

                case 4:
                    if (n == 0)
                    {
                        System.out.println("Array is empty");
                    }
                    else
                    {
                        int max = arr[0];
                        for (int i = 1; i < n; i++)
                        {
                            if (arr[i] > max)
                            {
                                max = arr[i];
                            }
                        }
                        System.out.println("Largest element = " + max);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        while (choice != 5);

       
    }
}