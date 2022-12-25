class ThreeD 
{
	public static void main(String[] args) 
	{
		int ar[][][]=new int[3][3][3],i=0;
		int arr[][][]={ {{1,1,1},{2,2,2},{3,3,3}}, {{4,4,4},{5,5,5},{6,6,6}}, {{7,7,7},{8,8,8},{9,9,9}} };
		
		System.out.println("1st 3D Array");
		for (int a=0 ;a<=2 ;a++ )
			for (int b=0 ;b<=2 ;b++ )
			{
				for (int c=0 ;c<=2 ; c++ )
				{
					ar[a][b][c]=Integer.parseInt(args[i]);
					i++;
					System.out.print(" "+ar[a][b][c]);
				}
				System.out.println();
			}

		System.out.println("2nd 3D Array");
		for (int a=0 ;a<=2 ;a++ )
			for (int b=0 ;b<=2 ;b++ )
			{
				for (int c=0 ;c<=2 ; c++ )
					System.out.print(" "+arr[a][b][c]);
				System.out.println();
			}

		System.out.println("1st 3D Array Printed Using For-Each Loop");
		for (int t[][]:ar)
			for (int j[]:t)
			{
				for (int g:j)
					System.out.print(" "+g);
				System.out.println();
			}
		
	}
}
