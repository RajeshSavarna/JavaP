package programs;
/*
------------------------------------------Rorrim it------------------------------------------------
1) First line is an integer specifying the number of trials t (1 <= t <= 10)
2) Second line is an integer giving the count (c) of reversed numbers (2 <= c <= 100)
3) Third line contains space separated c numbers written in reverse order.

Assume, all the numbers are positive integers. No number starts with a zero.

Output Specification:
Your program should output the numbers in ascending order.

Sample Input:
3
4
21 31 41 51
2
29 54
5
19 18 17 16 15

Sample Output:
12 13 14 15
45 92
51 61 71 81 91
*/
import java.util.Scanner;
public class Assignment6
{
	public static void main(String arg[])
	{
		int t=0, res[][]=new int[10][100];
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		int c[]=new int[t];
		for(int q=0;q<t;q++)
		{
			c[q]=s.nextInt();
			int a[]=new int[c[q]];
			for(int i=0;i<c[q];i++)
				a[i]=s.nextInt();
			for(int i=0;i<c[q];i++)
			{
				int temp=a[i];
				a[i]=0;
				while(temp>0)
				{
					int r=temp%10;
					temp=temp/10;
					a[i]=(a[i]*10)+r;
				}
			}
			for(int i=0;i<c[q];i++)
			{
				for(int j=i+1;j<c[q];j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
			}
			for(int i=0;i<c[q];i++)
				res[q][i]=a[i];
		}
		for(int q=0;q<t;q++)
		{
			for(int i=0;i<c[q];i++)
			{
                if (c[q]-1==i)
                    System.out.print(res[q][i]);
                else
					System.out.print(res[q][i]+" ");
            }
			System.out.println();
		}
	}
}