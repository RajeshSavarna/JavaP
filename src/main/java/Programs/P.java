package programs;
class  P
{
	public static void main(String[] args) 
	{
		int x=1,s=0,s1=0,s2=0,s3=0,s4=0;
		for (int i=0;i<5 ;i++ )
		{
			if( x%2==0)
			for (int j=1;j<=5 ;j++ )
			{
				System.out.print(j);
				
			}
			else
			for (int j=5;j>=1 ;j-- )
			{
				System.out.print(j);
				if(j%2==0)
					s1+=j;
				else
					s+=j;


			}
			System.out.println();
			x++;
		}
			

	}
}
