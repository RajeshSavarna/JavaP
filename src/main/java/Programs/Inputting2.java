package programs;
import java.io.*;
class  Inputting2
{
	public static void main(String[] args) 
	{
		input();
	}
	static void input()
	{
		BufferedReader br = null;
		String s="";
		
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Your Lines :-\n");
			while(true)
			{
				String a=br.readLine();
				if(a.equals("exit"))
					break;
				s=s+"\n"+a;
			}
			
			System.out.println("\n\nYour Entered Lines Are :- \n\n"+s+"\n");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
