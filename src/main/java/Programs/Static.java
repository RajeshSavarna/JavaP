class  Static
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		show();
		Static se=new Static();
		se.display();
	}
	static void show()
	{
		System.out.println("Static Show Method");
	}
	void display()
	{
		System.out.println("Non-Static Method");
	}
}
