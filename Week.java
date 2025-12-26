import java.util.Scanner;
class Week
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Choose your option : ");
			int day = sc.nextInt();
			
			switch(day)
			{
				case 1 -> {System.out.println("monday");}
				
				case 2 -> {System.out.println("Tuesday");}
				
				
				case 3 -> {System.out.println("wednesday");}
				case 4 -> {System.out.println("thuirsdaysday");}
				case 5 -> {System.out.println("friday");}
				case 6 -> {System.out.println("saturdayday");}
				case 7 -> {System.out.println("sunday");}
				
				default -> {System.out.println("holiday");}
				
				
			}
		}
	}
}