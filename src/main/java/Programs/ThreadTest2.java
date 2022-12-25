package programs;
class  ThreadTest2 implements Runnable
{
	Thread t,t1;
	ThreadTest2()
	{
		t=new Thread(this,"Child");
		t1= new Thread(this,"child1");
		t.start();
	}
	public void run()
	{
		int ch=0;
		try{
			for (int i=1; i<=10; i++)
			{
				if (Thread.currentThread()==t)
				{
					System.out.println(t.getName());
					t.sleep(500);
					if (ch==0)
					{
						t1.start();
						ch++;
					}
					else
						t1.resume();
					t.suspend();
				}
				else
				{
					System.out.println(t1.getName());
					t1.sleep(500);
					t.resume();
					t1.suspend();
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		new ThreadTest2();
	}
}
