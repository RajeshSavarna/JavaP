/*
Expected Time to solve:  35 minutes

You would like to withdraw Rs. X from an ATM. The ATM stores only Rs. 
100 notes and thus accepts the transaction if X is a multiple of 100. 
Ofcourse, your account balance must have enough cash to perform the withdrawal transaction (including bank charges).
For each successful withdrawal the bank charges Rs. 5

Calculate your account balance after an attempted transaction.

Input
Positive integer 0 < X <= 50000 - the amount of cash which you wish to withdraw.
Non-negative number 0<= Y <= 500000 with two digits of precision - your initial account balance.

Output
Output the account balance after the attempted transaction, given as a number with two digits of precision.
If there is not enough money in the account to complete the transaction, output the current bank balance.

Example - Successful Transaction
Input:
20000 50000

Output: 29995
Example - Incorrect Withdrawal Amount (not multiple of 100)

Input
4550 20000

Output
20000
Example - Insufficient Funds

Input
30000 25000

Output
25000


*/

/*Write your code here */

import java.util.Scanner;
import java.text.DecimalFormat;
public class CashWithdrawl {
    public static void main(String...arg){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float y = sc.nextFloat();
        DecimalFormat df = new DecimalFormat("#.##");
        int transactionCharge = 5;
        if (x>0 && x<=50000 && 0<=y && y<=500000) {
            if (x+5>y){
                System.out.println(df.format(y));
            } 
            else if (x%100!=0){
                System.out.println(df.format(y));
            }
            else {
                System.out.println(df.format(y-x-transactionCharge));
            }
        }
        /*else {
            System.out.println("-1");
        }*/
    }
}


/*
import java.util.Scanner; 

public class Atm { 

public static void main(String[] args) { 
Atm atm=new Atm(); 
Scanner input=new Scanner(System.in); 
System.out.println(atm.withdrawal(input.nextInt(), input.nextInt())); 
} 

public int withdrawal(int input1, int input2){ 
int output=-1; 
int transactionCharge=5; 
if(0 < input1 && input1 <= 50000){ 
if(input1%100==0){ 
if(0<= input2 && input2 <= 500000){ 
if(input2>=input1+5){ 
output=input2-(input1+transactionCharge); 
}else{ 
output=input2; 
} 
} 
}else{ 
output=input2; 
} 
} 
return output; 
} 
}
*/