package programs;
class IntSearch 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[5],m=0;
		for (int i=0;i<=4 ;i++ )
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		
		int a=Integer.parseInt(args[5]);
		for (int i=0;i<=4 ;i++ )
		{
				if (arr[i]==a)
				{
					System.out.println("Matched at Index number "+i);
					m++;
					
				}
			
		}
		if(m==0)
				System.out.println("Number Not Found in the Array ");
	}
}
