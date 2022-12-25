package programs;
class MatrixMulti 
{
	public static void main(String[] arg) 
	{
		int a[][]=new int[3][3], res[][]=new int[3][3],i=0;
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

		for (int x=0;x<=2 ;x++ )
		{
			for (int y=0;y<=2 ;y++ )
			{
				a[x][y]=Integer.parseInt(arg[i]);
				i++;
			}
		}
		
		System.out.print("1st Matrix\n");
		for (int x=0;x<=2 ;x++ )
		{
			for (int y=0;y<=2 ;y++ )
			{
				System.out.print(" "+a[x][y]);
			}
			System.out.print("\n");
		}

		System.out.print("2nd Matrix\n");
		for (int x=0;x<=2 ;x++ )
		{
			for (int y=0;y<=2 ;y++ )
			{
				System.out.print(" "+arr[x][y]);
			}
			System.out.print("\n");
		}

		
		System.out.print("After Multiplication of These Two Matrixes The Result is :-\n");
		for (int x=0;x<=2 ;x++ )
		{
			for (int y=0;y<=2 ;y++ )
			{
				i=0;
				for (int z=0;z<=2 ;z++ )
				{
					i=i+a[x][z]*arr[z][y];
				}	
				res[x][y]=i;
				System.out.print(" "+res[x][y]);
			}
			System.out.print("\n");
		}
	}
}
