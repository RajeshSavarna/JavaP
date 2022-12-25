package programs;
/*
Thabreez has been bullied enough all his life and now he seeks revenge. His first victim being Karthick, obviously! He found one question to take revenge from Karthick, but without knowing the answers of the question he would not be able to know whether Karthick's answers are correct or not.

The question consists of two numbers, a and b, and the answer to it is the sum of digits of a^b (i.e - a raise to the power b). Help him to find the answers so that he can take revenge from Karthick. (You should be able to write the solution for this problem in 25 minutes)

Input specification:

The first line contains the number of inputs t. After that t lines follow each containing a pair of space separated integers i.e. a and b.

Output specification:

For each input, you need to print the sum of digits in a^b.

Sample Input :

2

2 10

3 3

Sample Output :

7

9

Explanation:

Consider the first input. 2^10 = 1024. Now, 1 + 0 + 2 + 4 = 7 So, output for this input is 7.

Source Code :
*/
import java.util.Scanner;
import java.math.*;

class Revenge{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int t=s.nextInt();
String res="";
for(int i=0;i<t;i++){
BigInteger a=new BigInteger(s.next());
int b=s.nextInt();
BigInteger temp=a.pow(b);
BigInteger sum=new BigInteger("0");
BigInteger ten=new BigInteger("10");
while(temp.compareTo(BigInteger.ZERO)!=0){
sum=sum.add(temp.mod(ten));
temp=temp.divide(ten);
}
System.out.println(sum);
}
}
}