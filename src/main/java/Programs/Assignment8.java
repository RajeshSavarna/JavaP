package programs;
/*
------------------------------------------Mobile Key Pad------------------------------------------------
On a Mobile Key Pad the letters are mapped to the digits like following : 
ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9) 
Write a program which will take a String as input and the output will be a sequence of digits according to the mentioned mapping. 
Note: You can assume that the input will not contain more than 10 letters and all the letters will be in upper case 

Input Specification: Input will contain one line containing string in uppercase without spaces 

Output: Output should contain single line specifying the numbers corresponding to the characters in the string 

Sample Input : JAVA 
Sample Output: 5282
*/
import java.util.Scanner;
class Assignment8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		s=s.replaceAll("[ABC]","2"); s=s.replaceAll("[DEF]","3"); s=s.replaceAll("[GHI]","4"); s=s.replaceAll("[JKL]","5");
		s=s.replaceAll("[MNO]","6"); s=s.replaceAll("[PQRS]","7"); s=s.replaceAll("[TUV]","8"); s=s.replaceAll("[WXYZ]","9");
		System.out.println(s);
		
		
		/*
		char ch[]=s.toCharArray();
		String p="";
		for (int i=0 ;i<s.length() ;i++ )
		{
			if (ch[i]=='A' || ch[i]=='B' || ch[i]=='C')
				p=p+"2";
			else if (ch[i]=='D' || ch[i]=='E' || ch[i]=='F')
				p=p+"3";
			else if (ch[i]=='G' || ch[i]=='H' || ch[i]=='I')
				p=p+"4";
			else if (ch[i]=='J' || ch[i]=='K' || ch[i]=='L')
				p=p+"5";
			else if (ch[i]=='M' || ch[i]=='N' || ch[i]=='O')
				p=p+"6";
			else if (ch[i]=='P' || ch[i]=='Q' || ch[i]=='R' || ch[i]=='S')
				p=p+"7";
			else if (ch[i]=='T' || ch[i]=='U' || ch[i]=='V')
				p=p+"8";
			else if (ch[i]=='W' || ch[i]=='X' || ch[i]=='Y' || ch[i]=='X')
				p=p+"9";
			if (i==9) break;
		}
		System.out.println(p);
		*/
	}
}
