import java.util.Scanner;

public class Studentmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String students[]  = new String[5]; 
        int total = 0; 
        int option;

        do {
            System.out.println("menu");
            System.out.println("1. Add Student Name");
            System.out.println("2. Show Student Names");
            System.out.println("3. Terminate Program");
            System.out.print("Enter your option: ");
            option = sc.nextInt();
             

            switch (option) {
                case 1:
                    if (total < students.length) {
                        System.out.print("Enter student name: ");
                        students[total] = sc.nextLine();
                        total++;
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Student list is full.");
                    }
                    break;

                case 2:
                    if (total == 0) {
                        System.out.println("No students to display.");
                    } else {
                        System.out.println("Student Names:");
                        for (int i = 0; i < total; i++) {
                            System.out.println((i + 1) + " " + students[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (option != 3);

        
    }
}
