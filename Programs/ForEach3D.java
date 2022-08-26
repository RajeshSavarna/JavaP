class ForEach3D 
{
	public static void main(String[] args) 
	{
		int arr[][][]=new int[3][3][3];
		int i=0;
		for (int a=0 ;a<=2 ;a++ )
			for (int b=0 ;b<=2 ;b++ )
			{
				for (int c=0 ;c<=2 ; c++ )
				{
					arr[a][b][c]=Integer.parseInt(args[i]);
					i++;
					System.out.print(" "+arr[a][b][c]);
				}
				System.out.println();
			}

		for (int t[][]:arr )
			for (int j[]:t )
				for (int g:j)
					System.out.println(g);
		
	}
}
