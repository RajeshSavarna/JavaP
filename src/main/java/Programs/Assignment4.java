/*
------------------------------------------Replace by position------------------------------------------------
Write a java program which takes a character and a sentence as input. 
Replace the character in the sentence by their position numbers. 

Input Specification : 
First input is a single character. 
Second input is a sentence. 

Output Specification: 
Replace the character in the sentence by their position numbers. 
Assume, first position of the sentence is 1 and checking should be irstr3pective of case. 

Sample Input 1: i this is Ignite Sample 
Output 1: th2s 6s 9gn12te 

Sample Input 2: s i love Java 
Sample Output: i love Java
*/
import java.util.Scanner;
class Assignment4
{
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
		
		String str3="";
		/*
		for(int i=0;i<str2.length();i++)
		{
			char ch=str2.charAt(i);
			String h=Character.toString(ch);

			if(str1.equalsIgnoreCase(h))
			{
				str3=str3+(i+1);
				continue;
			}
			str3=str3+ch;
		}
		*/
        char ch1[]=str1.toCharArray();
        for (int i=0; i<str2.length(); i++)
        {
            char ch=str2.charAt(i);
			if (Character.toString(ch1[0]).equalsIgnoreCase(Character.toString(ch)))
			{
				str3=str3+(i+1);
				continue;
			}
			str3=str3+ch;
        }
        System.out.println(str3);
    }
}