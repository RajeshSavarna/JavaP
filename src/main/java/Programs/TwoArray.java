class TwoArray 
{
	public static void main(String[] args) 
	{
		int arr[][]=new int[3][3],i=0;
		for (int x=0;x<=2 ;x++ )
		{
			for (int y=0;y<=2 ;y++ )
			{
				arr[x][y]=Integer.parseInt(args[i]);
				i++;
			}
		}

		for (int x=0;x<=2 ;x++ )
		{
			for (int y=0;y<=2 ;y++ )
			{
				System.out.print(" "+arr[x][y]);
			}
			System.out.print("\n");
		}
	}
}
