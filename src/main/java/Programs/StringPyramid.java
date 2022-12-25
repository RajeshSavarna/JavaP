package programs;
class StringPyramid 
{
	public static void main(String[] args) 
	{
		A a=new A();
		int i=a.pyramid(args[0]);
		System.out.println("\nAfter Counting The Total Number Of Characters In String We Get "+i+" Characters");
	}
}


class A
{
	int pyramid(String s)
	{
		int i=s.length();
		char ch[]=s.toCharArray();
		for (int x=0;x<i ;x++ )
		{
			for (int y=x+1;y<i ;y++ )
				System.out.print(" ");

			for (int z=0;z<=x ;z++ )
				System.out.print(ch[z]+" ");
			System.out.println();
		}

		return i;
	}
}