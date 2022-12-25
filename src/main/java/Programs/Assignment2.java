package programs;
/*
------------------------------------------String palindrome------------------------------------------------
Write a java program to find out whether the given string is a palindrome or not.

Sample Input: madam
Sample Output: true

Sample Input: dam
Sample Output: false
*/
import java.util.Scanner;
class Assignment2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int a=0;
		for (int i=0;i<s.length() ;i++ )
		{
			if (ch[i]!=ch[(s.length()-1-i)])
			{
				a++;
				break;
			}
		}
		if (a==0)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
