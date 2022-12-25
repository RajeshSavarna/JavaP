package programs;
class Factorial 
{
	public static void main(String[] args) 
	{
		int j=Integer.parseInt(args[0]);
		int fact=1;
		for (int i=j ;i>0 ;i-- )
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+j+" = "+fact);
	}
}
