package programs;
/*
------------------------------------------------Sorting--------------------------------------------------------
Write a program to take the input from the user and print the same numbers in sorted order from smallest to largest.
The user will input a zero to mark the end of the input. Assume that at most 100 positive numbers will be entered.

Sample Input:
56 48 89 14 29 65 34 67 2 4 44 0
Sample output:
2 4 14 29 34 44 48 56 65 67 89
*/
import java.util.Scanner;
class Assignment1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		int count=0;
		for (int i=0;i<100 ;i++ )
		{
			int b=sc.nextInt();
			if (b==0)
				break;
			else
				a[i]=b;
			count++;
		}

		for (int i=0;i<count ;i++ )
		{
			for (int j=i;j<count ;j++ )
			{
				if (a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
			
	}
}
