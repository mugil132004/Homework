
package rockpapersissor;
import java.util.Scanner;
import java.util.Random;


public class Rockpapersissor {

    
    public static void main(String[] args) {
      


        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter your choice");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");

        int user = sc.nextInt();

        int computer = r.nextInt(3) + 1;

        System.out.println("Computer choice: " + computer);

        if (user == computer) {
            System.out.println("Match Draw");
        } 
        else if (user == 1 && computer == 3) {
            System.out.println("User Wins");
        } 
        else if (user == 2 && computer == 1) {
            System.out.println("User Wins");
        } 
        else if (user == 3 && computer == 2) {
            System.out.println("User Wins");
        } 
        else {
            System.out.println("Computer Wins");
        }

        
    }
}
    
    

