package programs;
/*
------------------------------------------String Hacker------------------------------------------------
Problem Statement : 
Write a program that will print the following charactaristics of the String 
1. length of the string 
2. print only the first half of the string2. (If length is an odd number,(length-1)/2 ) 
3. Remove all spaces(if any) in the line and print 
4. Replace all the vowels with "_" 

Input Specification : Input will be a line of text with only alphabetic characters in it. 
Output Specification : If input text has any non-alphabetic character, Print "Invalid Input". 
Else, 
First line should print the length of the string 
Second line is the first half of the string 
Third line is the input text without spaces 
Fourth line is the input text with all the vowels replaced by "_" 

Sample Input : This is a sample input line of text 
Sample Output : 
35 
This is a sample
Thisisasampleinputlineoftext
Th_s _s _ s_mpl_ _np_t l_n_ _f t_xt
*/
import java.util.Scanner;
class Test1
{
    public static void main(String[] args)
    {
        try{
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            if (s.matches("[a-zA-Z ]+"))
            {
				
				int length=s.length();
                System.out.println(length);
                /*/
                char ch[]=s.toCharArray();
                int length=s.length();
                if (length%2!=0)
                    length=(length-1)/2;
                else
                    length=length/2;   
                for (int i=0;i<length;i++)
                    System.out.print(ch[i]);
                */
                 if (length%2!=0)
                    System.out.println(s.substring(0,(length-1)/2));
                else
                    System.out.println(s.substring(0,length/2));


                String s1=s.replaceAll(" ","");
                System.out.println(s1);
                
                System.out.println(s.replaceAll("[AEIOUaeiou]","_"));
            }
            else
                System.out.println("Invalid Input");
			/* 
			String temp=s; 
			if(s.matches("^[ A-Za-z]+$"))
			{ 
				System.out.println(s.length()); 
				System.out.println(s.substring(0,s.length()%2==0?s.length()/2:(s.length()-1)/2)); 
				System.out.println(s.replaceAll(" ", "")); 
				System.out.println(temp.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "_")); 
			}
			else
				System.out.println("Invalid Input!");  
			*/
        }catch(Exception e) {e.printStackTrace();}
    }
}