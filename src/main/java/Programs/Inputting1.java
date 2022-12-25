package programs;
import java.io.*;
class  Inputting1
{
	public static void main(String[] args) 
	{
		input();
	}
	static void input()
	{
		BufferedReader br;
		String s;
		
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 5 Lines :-\n");
			s=br.readLine();
			for(int i=0; i<=4; i++)
			{
				s=s+"\n"+br.readLine();
				//s=s+a;

			}
			
			System.out.println("\n\nYour Entered Lines Are :- \n\n"+s);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
