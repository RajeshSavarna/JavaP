package programs;
class ArSum 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		int sum=0;
		for (int i=0;i<5 ;i++ )
		{
			arr[i]=Integer.parseInt(args[i]);
			sum+=arr[i];
		}
		System.out.println("Sum = "+sum);
	}
}
