package programs;
import java.util.Scanner;
class Reverse1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0;
		while (a>0)
		{
			rev=rev*10+(a%10);
			a=a/10;
		}
		System.out.println("Reverse of "+a+"= "+rev);
	}
}
