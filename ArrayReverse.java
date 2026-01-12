import java.util.Scanner;

public class ArrayReverse {

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

    
    static void displayReverse() {
        System.out.println("Array elements in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Enter Numbers");
            System.out.println("2. Display Numbers");
            System.out.println("3. Display Numbers in Reverse Order");
            System.out.println("4. Exit");
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
                    displayReverse();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }
}