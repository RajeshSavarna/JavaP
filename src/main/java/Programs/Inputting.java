package programs;
import java.io.*;
class  Inputting
{
	public static void main(String[] args) 
	{
		input();
	}
	static void input()
	{
		BufferedReader br = null;
		String s=null;
		char ch='a';
		
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a String");
			s=br.readLine();
			System.out.println("Enter a Character");
			ch = (char)br.read();

			System.out.println("You Entered = "+s+" & "+ch);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
