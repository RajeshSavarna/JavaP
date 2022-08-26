class SortForEach 
{
	public static void main(String[] args) 
	{
		int a[]={3,5,4,7,3},m,k=1;
		for (int n:a)
		{
			for (int j=k;j<=4 ;j++ )
			{
				if (n>a[j])
				{
					m=a[j];
					a[j]=n;
					n=m;
					a[k-1]=m;
				}
			}
			k++;
		}
		for (int n:a)
		{
			System.out.println(n);
		}
		
	}
}
