class  StaticBody
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		show();
		StaticBody se=new StaticBody();
		se.display();

		A a=new A();
		A.method();
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

class A
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
