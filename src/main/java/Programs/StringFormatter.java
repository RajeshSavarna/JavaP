/*
Write a program that reads in a String. 
If a word in the String contains a numeral n (0 < n < 10) then your program must replace 
that numeral by the character that follows the numeral repeated n times. 
It can be assumed that there is no numeral at the end of any word. 

Sample Input: I wo3rk a2t Ig5ni6te. 
Sample Output: I worrrk att Ignnnnnitttttte.
*/
import java.util.Scanner; 
public class StringFormatter
{ 
	public static void main(String[] args)
	{ 
		Scanner input=new Scanner(System.in); 
		System.out.println(replaceNumerals(input.nextLine())); 
	} 

	public static String replaceNumerals(String input)
	{ 
		StringBuilder output=new StringBuilder(); 
		for(int i=0;i<input.length();i++)
		{ 
			if(Character.isDigit(input.charAt(i)))
			{ 
				for(int j=1;j<Integer.valueOf(Character.toString(input.charAt(i)));j++)
					output.append(input.charAt(i+1)); 
			}
			else
				output.append(input.charAt(i)); 
		}
		return output.toString(); 
	}
}