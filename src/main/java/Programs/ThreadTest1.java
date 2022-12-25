package programs;
class ThreadTest1 implements Runnable 
{
	Thread t;
	ThreadTest1()
	{
		t=new Thread(this,"child");
		t.start();
	}
	public void run()
	{
		try{
			String s=t.getName();
			System.out.println("Name of Thread is "+s);
			System.out.println("Priority = "+t.getPriority());
			t.sleep(500);
			t.setName("New Name");
			System.out.println("After changing the name name is "+t.getName());
			t.sleep(300);
			t.setPriority(3);
			System.out.println("Priority Changed to "+t.getPriority());
			System.out.println("Thread Object "+Thread.currentThread());
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		new ThreadTest1();
	}
}
