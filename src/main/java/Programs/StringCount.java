package programs;
class StringCount 
{
	public static void main(String[] args) 
	{
		Aaa a=new Aaa();
		int i=a.count(args[0]);
		System.out.println("After Count = "+i);
	}
}


class Aaa
{
	int count(String s)
	{
		return s.length();
	}
}