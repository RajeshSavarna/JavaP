//coding challenge TCS open ignite  
import java.util.Scanner;
class Platinum
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double block = in.nextInt();

		if(block>=2 && block<=1000000000)
		{
			if(block==2)
			{
				System.out.println(Math.round(block));
			}
			else
			{
				System.out.println(Math.round((block/2)+(block/3)+(block/4)));
			}
		}
		else
		{
			System.out.print("Invalid!");
		}
	}
}
