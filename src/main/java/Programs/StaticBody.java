package programs;
class  StaticBody
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		show();
		StaticBody se=new StaticBody();
		se.display();

		A11 a=new A11();
		A11.method();
	}
	static void show()
	{
		System.out.println("Static Show Method");
	}
	void display()
	{
		System.out.println("Non-Static Method");
	}
	static
	{
		System.out.println("Static Body in Main Class");
	}
}

class A11
{
	static void method()
	{
		System.out.println("Static Method in Class A");
	}
	static
	{
		System.out.println("Static Body in Class A");
	}
}
