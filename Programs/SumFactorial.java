// Question. 2!+4!+6!+8!+......+n terms

import java.util.Scanner;
class SumFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		SumFactorial s=new SumFactorial();
		s.factorial(a);
	}
	void factorial(int x)
	{
		int a=1, fact=1, sum=0, c=2,b;
		while(a<=x)
		{
			if (c%2==0)
			{
				a++;
				b=c;
				fact=1;
				while (b>=1)
				{
					fact*=b;
					b--;
				}
				sum+=fact;
			}
			c++;
		}
		System.out.println(sum);
	}
}
