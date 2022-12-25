class Pattern1 
{
	public static void main(String arg[]) 
	{
		int m=1;
		for (int i=9;i>=0;i--)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print(j);
			}
			for (int k=1 ;k<m ;k++ )
			{
				System.out.print(" ");
			}
			m+=2;
			int l=i;
			for (int j=0;j<=i;j++)
			{
				System.out.print(l);
				l--;
			}
			System.out.print("\n");
		}

	}
}