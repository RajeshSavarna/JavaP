package programs;
/*
---------------------------------------------Automorphic Number---------------------------------------------------
Write a Program in Java to input a number and check whether it is an Automorphic Number or not. 
Note: An automorphic number is a number which is present in the last digit(s) of its square. 
Example: 6 is an automorphic number as its square is 36 and 6 is present as the last digit.

Sample Input: 6
Sample Output: 6 is an automorphic number

Sample Input: 4

Sample Output: 4 is not an automorphic number
*/
import java.util.Scanner;
class Assignment10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sq=a*a, temp=a, c=0;
		while (temp>0)
		{
			c++;
			temp=temp/10;
		}
		if (sq%(int)Math.pow(10,c)==a)
			System.out.println(a+" is an automorphic number");
		else
			System.out.println(a+" is not an automorphic number");
		/*
		String n=Integer.toString(a). square=Integer.toString(sq);
		if (square.endsWith(n)) System.out.println(a+" is an automorphic number");
		else System.out.println(a+" is not an automorphic number");
		*/
	}
}
