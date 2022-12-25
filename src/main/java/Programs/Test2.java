package programs;
/*
------------------------------------------Search------------------------------------------------
Write a java program to get n integers from the user and a number to be searched.
Your program should also print the number of integers which are less than the search number and greater than the search number.

Input specification:
Number of elements in the array and the N elements the number to be search.

Output specification:
Print "YES" or "NO" if the search number is present in the array,
the number of elements which are less than the search number and 
the number of elements which are greater than the search number

Sample Input: 5 1 2 3 4 5 8
Sample Output: NO 5 0

Explanation: 
5 denotes the number of elements of the array, 
1, 2, 3, 4, 5 are the elements of the array and 
8 is the search number.

8 is not present in the array, 
so print "NO", and 
there are 5 numbers less than 8 and 
there is no number greater than 8, so the count is 0.
*/
import java.util.Scanner;
class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size ;i++ )
			arr[i]=sc.nextInt();
		int search=sc.nextInt(), great=0, less=0, match=0;
		
		for (int t:arr )
		{
			if (search<t)
				great++;
			else if (search>t)
				less++;
			else
				match++;
		}
		if (match==0)
			System.out.println("NO");
		else
			System.out.println("YES");
		System.out.println(less);
		System.out.println(great);
	}
}
