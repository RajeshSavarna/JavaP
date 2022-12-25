package programs;
class String1 
{
	public static void main(String[] args) 
	{
		String name[]=new String[10];
		for (int i=0;i<10 ;i++ )
		{
			name[i]=args[i];
		}

		for (int i=0;i<10 ;i++ )
		{
			for (int j=i+1;j<10 ;j++ )
			{
				if (name[i].equals(name[j]))
				{
					System.out.println("After Matching "+name[j]);
				}
			}
		}
	}
}
