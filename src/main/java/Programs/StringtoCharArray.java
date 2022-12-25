class StringtoCharArray 
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.show("Raku","jesh");
		a.show("rajeshsavarna");
		System.out.println();
	}
}

class A
{
	void show(String a)
	{
		char ch[]=a.toCharArray();
		int x=1;
		int i=a.length();
		for (int t=0;t<=i-2 ;t++ )
		{
			for (int s=t+1;s<=i-1 ;s++ )
			{
				if (ch[t]==ch[s])
				{
					x++;
					ch[s]='\0';
				}
                  
			}
			if(x>1)
			{
				if(ch[t]!='\0')
					System.out.println(ch[t]+" repeated "+x+" times");
				x=1;
			}
		}

	}

	void show(String s, String a)
	{
		char ch[]=s.toCharArray();
		int z=s.length();
		for (int t=0;t<=z-1;t++ )
		{
			if(t==2)
				System.out.print(a);
			System.out.print(ch[t]);
		}
		System.out.println("\n");
	}
}
