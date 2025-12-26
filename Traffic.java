import java.util.Scanner;
class Traffic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Choose your option : ");
			int signal = sc.nextInt();
			
			switch(signal)
			{
				case 1-> {System.out.println("red");
				System.out.println("stop");}
				
				case 2 -> {System.out.println("yellow");
				System.out.println("wait");}
				
				
				case 3-> {System.out.println("green");
				System.out.println("wait");}
				
				
				default -> {System.out.println("blocked");}
				
				
			}
		}
	}
}