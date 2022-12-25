package programs;
class Case 
{
	public static void main(String[] args) 
	{
		int c=Integer.parseInt(args[0]);
		int x=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		switch(c)
		{
			case 1:
				System.out.println("Sum = "+(x+y));
				break;
			case 2:
				System.out.println("Multiplication = "+(x*y));
				break;
			case 3:
				System.out.println("Remainder = "+(x%y));
				break;
			case 4:
				System.out.println("Greatest = "+(x>y?x:y));
				break;
			default:
				System.out.println("Case Value is Wrong Please Enter the case value as 1,2,3,4");
		}
	}
}
