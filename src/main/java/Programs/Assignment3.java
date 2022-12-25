/*
------------------------------------------Double Dutch------------------------------------------------
Write an application that encodes English language phrases into Double Dutch using the following algorithm:
To form a Double Dutch sentence from an English sentence,
translate each English word into a Double Dutch word,
place the first letter of the English word at the end of the word and add the letters "ay." 
Thus the word "jump" becomes "umpjay," the word "the" becomes "hetay," and the word "ignite" becomes "gniteiay."

Blanks between words remain as blanks.  Assume that the English sentence consists of words separated by blanks,
there are no punctuation marks and all words have two or more letters.

Write a program to print the Double Dutch Word that takes as input a word and prints the Double Dutch equivalent.
Assume all letters are lowercase.

Input Specification: A line containing text to be converted.
Output Specification: The double dutch text line.

Sample input : this is ignite
Sample Output : histay siay gniteiay
*/
import java.util.Scanner;
class Assignment3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sp[] = s.split(" "), word="", c="";
		
		for (String split:sp)
		{
			char ch[]=split.toCharArray();
			for (int j=0;j<split.length() ;j++ )
			{
				if (j==0)
				{
					c=Character.toString(ch[j]);
				}
				if (j>0)
				{
					word=word+ch[j];
				}
				if (j==(split.length()-1))
				{
					word=word+c+"ay ";
				}
			}
		}
		System.out.println(word);
	}
}

/*
import java.util.Scanner; 

class Assignment3
{ 
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in); 
		System.out.println(englishToDoubleDutch(sc.nextLine().split(" "))); 
	} 

	public static String englishToDoubleDutch(String[] s)
	{ 
		StringBuffer output=new StringBuffer(); 
		for(String word:s) 
			output.append(printDutchWord(word)+" "); 

		return output.toString().trim(); 
	} 

	public static String printDutchWord(String word)
	{ 
		return (word.length()>1?word.subSequence(1,word.length())+Character.toString(word.charAt(0))+"ay":word); 
	} 
} 
*/