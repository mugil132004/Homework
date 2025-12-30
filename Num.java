import java.util.Scanner;
 class Num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        if (num%3==0&&num%7==0) {
            System.out.println("multiple of 3 and 7");
        }
         else if ( num%3==0 ) {
            System.out.println("multiple of 3");
        }else if ( num%7==0 ) {
            System.out.println("multiple of 7");
        } else {
            System.out.println("not a multiple of 3 and 7");
        }

        
    }
}
