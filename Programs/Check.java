class Check
{
	public static void main(String[] args)
	{
		System.out.println(pow(2,3));
	}
	
	static int pow(int x, int y)
	{
		if (y==0)
		{
			
			System.out.println("---------"+x+" "+y+"----------");
			return 1;
		}
		else
		{
			System.out.println("+++++++++"+x+" "+y+"+++++++++");
			return x*(pow(x,y-1));
		}
	}
}

/* 
		2*pow(2,3)		2*pow(2,2)		2*pow(2,1)		2*pow(2,0)
*/