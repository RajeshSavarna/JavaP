//Question.  1+2+4+6+8+10+......+ n terms 
import java.util.Scanner;
class SumTerms
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int c=1,i=1;

		while(i<=n)
		{
			if (c==1)
			{
				sum+=c;
				i++;
			}
			if (c%2==0)
			{
				sum+=c;
				i++;
			}
			c++;
		}
		System.out.println(sum);
	}
}
