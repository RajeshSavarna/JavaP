package programs;
/*
------------------------------------------Remove "x"------------------------------------------------
Write a program that takes a string and checks whether the first or the second character or both is the letter 'x' or not. 
If so then omit those characters and print the rest of the string. 
Else print the original string unchanged. If the output string is empty print 0.

Input specification: The input consists of a single string as an input.
Output Specification: The output is a single string based on the input.

Sample Input: xxhi
Sample Output: hi
*/
import java.util.Scanner;
class Assignment5
{
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if (s.indexOf("x")==0 || s.indexOf("x",1)==1)
        {
            if (s.charAt(0)=='x' && s.indexOf("x",1)==1)
            {
                s=s.replaceFirst("x","");
                s=s.replaceFirst("x","");
            }
            else
                s=s.replaceFirst("x","");   
        }
        if (s.equals("")) System.out.println("0");
        else System.out.println(s);
    }
}
