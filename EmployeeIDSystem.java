import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeIDSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> employeeIDs = new ArrayList<>();

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    employeeIDs.add(id);
                    System.out.println("Employee ID added.");
                    break;

                case 2:
                    System.out.print("Enter employee ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < employeeIDs.size(); i++) {
                        if (employeeIDs.get(i) == removeId) {
                            employeeIDs.remove(i);
                            found = true;
                            System.out.println("Employee ID removed.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 3:
                    if (employeeIDs.isEmpty()) {
                        System.out.println("No employee IDs to display.");
                    } else {
                        System.out.println("\nEmployee IDs:");
                        for (int empId : employeeIDs) {
                            System.out.print(empId + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

       
    }
}
