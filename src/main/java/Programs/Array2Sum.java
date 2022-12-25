// Commandline Program
class Array2Sum 
{
	public static void main(String[] arg) 
	{
		int arr[]=new int[5], arr1[]=new int[5], sum[]=new int[5];
		for (int i=0;i<=4 ;i++ )
		{
			arr[i]=Integer.parseInt(arg[i]);
			arr1[i]=Integer.parseInt(arg[i+5]);
			sum[i]=arr[i]+arr1[i];
			System.out.println(" "+sum[i]);
		}	
	}
}
