class Mark
{
	public static void main(String[] args)
	{
		int mark = 95;
		
		if((mark>=90)&&(mark<=100))
		{
			System.out.println("A Grade");
		}
		else if((mark>=70)&&(mark<90))
		{
			System.out.println("B Grade");		
		}
		else if((mark>=50)&&(mark<70))
		{
			System.out.println("C Grade");		
		}
		else if((mark<50)&&(mark>=25))
		{
			System.out.println("D Grade");		
		}
		else if((mark<25))
		{
			System.out.println("fail Grade");		
		}
		else
		{
			System.out.println("Invalid Mark");		
		}
	}
}