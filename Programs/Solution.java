import java.util.Scanner;
public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		for(char ch1 : ch)
		{
			int count=0;
			for(char ch2 : ch)
			{
				if(ch1==ch2)
				{
					count++;
				}
			}
			if (count>=2)
			{
				System.out.println(ch1+" Matched "+count+" times");
			}
		}
		
	}
}