package programs;
class Greatest 
{
	public static void main(String[] args) 
	{
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		int z= Integer.parseInt(args[2]);
		if(x>y&&x>z)
		{
			System.out.println("x is greatest");
			if(y>z)
			{
				System.out.println("y is Middle");
				System.out.println("z is Lowest");
			}
			else
			{
				System.out.println("z is middle");
				System.out.println("y is lowest");
			}
		}

		else if(y>x&&y>z)
		{
			System.out.println("y is greatest");
			if(x>z)
			{
				System.out.println("x is Middle");
				System.out.println("z is Lowest");
			}
			else
			{
				System.out.println("z is middle");
				System.out.println("x is lowest");
			}
		}

		else if(z>x&&z>y)
		{
			System.out.println("z is greatest");
			if(x>y)
			{
				System.out.println("x is Middle");
				System.out.println("y is Lowest");
			}
			else
			{
				System.out.println("y is middle");
				System.out.println("x is lowest");
			}
		}
	}
}
