package programs;
/*
Find the sum of the factors of a number including 1 and the given number.

Input specification: Number of test cases T followed by T lines of number n.
0 < T <= 5000
0 < n <= 999999999

Note: The number will not have a very large prime factor.

Output specification: The sum of the factors for each test case.

Example Input: 2 6 5

Output: 12 6
*/
import java.util.Scanner;
public class SumOfFactors 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String...args) 
	{
		int t = sc.nextInt();
		if (0<t && t<=5000) sof(t);
	}
	public static void sof(int t)
	{
		int n[] = new int[t], res=0;
		for (int i=0 ; i<t ; i++)
		{
			n[i] = sc.nextInt();
			if (0<n[i] && n[i]<=999999999)
			{
				res=0;
				for (int j=1 ; j<=n[i] ; j++)
					if (n[i]%j==0) res+=j;
				System.out.println(res);
			}
		}
	}
}