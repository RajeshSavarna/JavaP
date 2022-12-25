package programs;
class MatrixTranspose 
{
	public static void main(String[] arg) 
	{
		int a[][]=new int[3][3], i=0;

		for (int x=0;x<=2 ;x++ )
		{
			for (int y=0;y<=2 ;y++ )
			{
				a[x][y]=Integer.parseInt(arg[i]);
				i++;
			}
		}
		
		System.out.print("Matrix Before Transpose\n");
		for (int x=0;x<=2 ;x++ )
		{
			for (int y=0;y<=2 ;y++ )
			{
				System.out.print(" "+a[x][y]);
			}
			System.out.print("\n");
		}

		System.out.print("Matrix After Transpose\n");
		for (int x=0;x<=2 ;x++ )
		{
			for (int y=0;y<=2 ;y++ )
			{
				System.out.print(" "+a[y][x]);
			}
			System.out.print("\n");
		}
	}
}
