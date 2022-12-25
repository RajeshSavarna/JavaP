package programs;
// Commandline Program
class  Reverse
{
	public static void main(String arg[]) 
	{
		int x=Integer.parseInt(arg[0]);
		int temp=x;
		while(x>0)
		{
			temp=x%10;
			x=x/10;
			System.out.print(temp);
		}
		/*
		int rev=0;
		while(n>0)
		{
			temp=x%10;
			rev=rev*10+temp;
			x=x/10;
		}
		System.out.print(rev);*/
	}
}
