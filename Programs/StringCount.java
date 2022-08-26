class StringCount 
{
	public static void main(String[] args) 
	{
		A a=new A();
		int i=a.count(args[0]);
		System.out.println("After Count = "+i);
	}
}


class A
{
	int count(String s)
	{
		return s.length();
	}
}