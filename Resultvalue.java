import java.util.Scanner;

public class Resultvalue {

    
    static int m1, m2, m3, total;
    static double percentage;
    static Scanner sc = new Scanner(System.in);

    
    static void inputMarks() {
        System.out.print("Enter marks for Subject 1: ");
        m1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        m2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        m3 = sc.nextInt();
    }

  
    static void calculateTotal() {
        total = m1 + m2 + m3;
        System.out.println("Total Marks = " + total);
    }

    
    static void calculatePercentage() {
        total = m1 + m2 + m3;
        percentage = total / 3.0;
        System.out.println("Percentage = " + percentage + "%");
    }

    
    static void displayResult() {
        calculatePercentage();
        if (percentage >= 40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

    
    static void displayGrade() {
        calculatePercentage();
        if (percentage >= 75)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }

    public static void main(String[] args) {

        int choice;

        
        inputMarks();

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    calculateTotal();
                    break;
                case 2:
                    calculatePercentage();
                    break;
                case 3:
                    displayResult();
                    break;
                case 4:
                    displayGrade();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);
    }
}
