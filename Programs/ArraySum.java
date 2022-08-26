// Commandline Program
class ArraySum 
{
	public static void main(String[] arg) 
	{
		int arr[]=new int[5];
		for (int i=0;i<=4 ;i++ )
		{
			arr[i]=Integer.parseInt(arg[i]);
		}
		int sum=0;
		for (int i=0;i<=4 ;i++ )
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
