import java.util.Scanner;
class Train
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Choose your option : ");
			int ticket = sc.nextInt();
			
			switch(ticket)
			{
				case 1-> {System.out.println("general");
				System.out.println("1000");}
				
				case 2 -> {System.out.println("sleeper");
				System.out.println("800");}
				
				
				case 3-> {System.out.println("ac third");
				System.out.println("700");}
				case 4-> {System.out.println("ac second");
				System.out.println("600");}
				case 5-> {System.out.println("first class");
				System.out.println("500");}
				
				
				default -> {System.out.println("no ticket");}
				
				
			}
		}
	}
}