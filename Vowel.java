import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char vo= sc.next().charAt(0);

        switch (vo) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
