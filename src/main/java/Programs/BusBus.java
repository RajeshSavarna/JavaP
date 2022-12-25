package programs;
/*
The game of bus-bus is played by a set of people, who form a circle.
One of the persons in the circle has to say 'one', the next person should say 'two' and so on.
Whenever a person gets a number, which is either divisible by seven or ends with seven,
he/she should say 'Bus' instead of the number.
If the number in turn is both visible by seven and ends with a seven, then 'BusBus' should be uttered.
Any one who violates the rule is taken out of the circle and the game continues with the remaining persons.
The last one remaining is the winner of the game. Write a program to simulate this game.
Input to your program is n (10 <= n <= 100) upto which the above rule should be followed.

Sample input
20

Sample output
1
2
3
4
5
6
BusBus
8
9
10
11
12
13
Bus
15
16
Bus
18
19
20
*/

import java.util.Scanner;
class BusBus 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ( 10<=n && n<=100)
			game(n);
	}
	public static void game(int n)
	{
		for (int i=1 ; i<=n ; i++ )
		{
			if (i%7==0 && i%10==7)
				System.out.println("BusBus");
			else if (i%7==0 || i%10==7)
				System.out.println("Bus");
			else
				System.out.println(i);
		}
	}
}
