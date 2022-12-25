package programs;
class Threadtest implements Runnable 
{
	Thread t;
	Threadtest()
	{
		t = new Thread(this,"child");
		t.start();
	}
	public void run()
	{
		for (int i=0;i<=5 ;i++ )
		{
			try
			{
				System.out.println("Thread Testing");
				t.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) 
	{
		Threadtest tt = new Threadtest();
	}
}
