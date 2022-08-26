/*
In the game of cricket, overs are specified as 45.5 which means 45 overs and five balls. 
In other words, the digit following the decimal point gives the number of balls that is always less than six.
Write a program that would sum a series of such numbers and print the result as two integers, 
the first one specifying the number of overs and the second one giving the number of balls. 
The series of inputs is terminated with a zero.

Sample input 1
2.5
4.2
3.1
0

Sample output 1
10 2

Sample input 2
2.3
4.3
0

Sample output 2
7 0
*/
/*
import java.util.Scanner;
import java.text.DecimalFormat;
class BallCount{
    public static void main(String...asd){
        Scanner sc = new Scanner(System.in);
        double a=0, b=0;
        DecimalFormat f = new DecimalFormat("##.0");
        while(true){
            b = sc.nextDouble();
            if (b == 0) break;
            a+=b;
        }
        b=Math.floor(a);
        if (a-0.6 < b)
            System.out.println(a);
        else
        {
            a=(a-0.6)+1.0;
            System.out.println(f.format(a));
        }
    }
}
*/
import java.util.Scanner;
class BallCount{
    public static void main(String...asd){
        Scanner sc = new Scanner(System.in);
        int a=0, b=0;
        String over = "";
        while(sc.hasNext()){
            over = sc.next();
            if (over.equals("0")){
                break;
            }
            int i = over.indexOf(".");
            a+=Integer.parseInt(over.substring(0,i));
            b+=Integer.parseInt(over.substring(i+1));
        }
        a+=b/6;
        b=b%6;
        System.out.println(a+" "+b);
    }
}