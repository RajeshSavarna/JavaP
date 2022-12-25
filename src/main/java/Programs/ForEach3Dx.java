package programs;
class ForEach3Dx 
{
	public static void main(String[] args) 
	{
		int arr[][][]={ {{1,1,1},{2,2,2},{3,3,3}}, {{4,4,4},{5,5,5},{6,6,6}}, {{7,7,7},{8,8,8},{9,9,9}} };
		
		for (int a=0 ;a<=2 ;a++ )
			for (int b=0 ;b<=2 ;b++ )
			{
				for (int c=0 ;c<=2 ; c++ )
				{
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
