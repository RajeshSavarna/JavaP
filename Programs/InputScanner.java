import java.util.*;
class  InputScanner
{
	public static void main(String[] args) 
	{
		input();
	}
	static void input()
	{
		try{

		Scanner br = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=br.nextLine();
		System.out.println("Enter a Number");
		int a = br.nextInt();

		System.out.println("You Entered = "+s+"& "+a);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
