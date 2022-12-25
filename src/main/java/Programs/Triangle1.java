package programs;
class Triangle1 
{
	public static void main(String arg[]) 
	{
		int m=1;
		for (int i=10;i>=0;i--)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for (int k=1 ;k<=m ;k++ )
			{
				System.out.print("*");
			}
			m+=2;
			System.out.print("\n");
		}

	}
}