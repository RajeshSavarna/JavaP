// Commandline Program
class ArraySort 
{
	public static void main(String[] arg) 
	{
		int arr[]=new int[5];
		for (int i=0;i<=4 ;i++ )
		{
			arr[i]=Integer.parseInt(arg[i]);
		}

		for (int i=0;i<=4 ;i++ )
		{
			for (int j=i;j<=4 ;j++ )
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
			System.out.print(" "+arr[i]);
		}	
	}
}
