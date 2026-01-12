import java.util.Scanner;

public class CountNumbers {

    static int[] arr = new int[10];
    static Scanner sc = new Scanner(System.in);

    
    static void enterNumbers() {
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

     static void displayNumbers() {
        System.out.println("Array elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    static void countPositive() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("Positive numbers count: " + count);
    }

    
    static void countNegative() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Negative numbers count: " + count);
    }

    
    static void countZero() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("Zero count: " + count);
    }

   
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Enter Numbers");
            System.out.println("2. Display Numbers");
            System.out.println("3. Count Positive Numbers");
            System.out.println("4. Count Negative Numbers");
            System.out.println("5. Count Zeros");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    enterNumbers();
                    break;
                case 2:
                    displayNumbers();
                    break;
                case 3:
                    countPositive();
                    break;
                case 4:
                    countNegative();
                    break;
                case 5:
                    countZero();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
    }
}