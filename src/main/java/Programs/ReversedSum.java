/*
Reversed number is a number written in arabic numerals but the order of digits is reversed. 
The first digit becomes last and vice versa. Note that all the leading zeros are omitted. 
That means if the number ends with a zero, the zero is lost by reversing (e.g. 1200 gives 21). 
Also note that the reversed number never has any trailing zeros.

Your task is to add two reversed numbers and output their reversed sum.

Input Explanation:
The input consists of N cases (equal to about 10000). 
The first line of the input contains only positive integer N. Then follow the cases. 
Each case consists of exactly one line with two positive integers separated by space. 
These are the reversed numbers you are to add.

Output Explanation:
For each case, print exactly one line containing only one integer - the reversed sum of two reversed numbers. 
Omit any leading zeros in the output.

Sample Input:
3
24 1
4358 754
305 794

Sample Output:
34
1998
1

Explanation: For the first sample input, 3 refers to the number of tests. 
In the first test  24 and 1 are the two numbers ,the reverse of 24 is 42 and for 1 it is 1. 
Hence the sum of 42 and 1 is 43. The reverse of 43 is 34.
*/
import java.util.Scanner;
public class ReversedSum {
    public static void main(String...arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String inputs[]= null;
        for (int i=0; i<N; i++) {
            inputs = sc.nextLine().split(" ");
            System.out.println(getReversedSum(Integer.valueOf(inputs[0]),Integer.valueOf(inputs[1])));
        }
    }
    
    public static int getReversedSum(Integer number1, Integer number2){
        int reversedSum = 0;
        int reverseNum1 = getReverseNumber(number1);
        int reverseNum2 = getReverseNumber(number2);
        reversedSum = getReverseNumber(reverseNum1 + reverseNum2);
        return reversedSum;
    }

    public static int getReverseNumber(Integer number){
        int reverseNumber = 0;
        char[] digits = number.toString().toCharArray();
        int length = digits.length;
        char[] reverseDigits = new char[length];
        for (int i=length; i>=1; i--){
            reverseDigits[length-i] = digits[i-1];
        }
        reverseNumber = Integer.valueOf(String.valueOf(reverseDigits));
        return reverseNumber;
    }
    
}

/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

 private static int number(char x) {
  switch (x) {
  case '0':
   return 0;
  case '1':
   return 1;
  case '2':
   return 2;
  case '3':
   return 3;
  case '4':
   return 4;
  case '5':
   return 5;
  case '6':
   return 6;
  case '7':
   return 7;
  case '8':
   return 8;
  case '9':
   return 9;
  }
  return 0;
 }

 public static void main(String[] args) throws NumberFormatException,
   IOException {
  BufferedReader reader = new BufferedReader(new InputStreamReader(
    System.in));
  int test = Integer.parseInt(reader.readLine());

  for (int i = 0; i < test; i++) {
   String[] str = reader.readLine().split(" ");

   char[] num1 = str[0].toCharArray();
   char[] num2 = str[1].toCharArray();

   int len1 = num1.length;
   int len2 = num2.length;

   int len = (len1 > len2) ? len1 : len2;

   int[] output = new int[len + 1];
   int carry = 0;
   int d = 0;
   for (d = 0; d < len; d++) {
    int sum;
    if ((d < len1) && (d < len2)) {
     sum = number(num1[d]) + number(num2[d]) + carry;
    } else if (d < len1) {
     sum = number(num1[d]) + carry;
    } else {
     sum = number(num2[d]) + carry;
    }

    if (sum >= 10) {
     output[d] = sum % 10;
     carry = 1;
    } else {
     carry = 0;
     output[d] = sum;
    }
   }
   if (carry > 0) {
    output[d] = carry;
    d++;
   }

   int start = 0;
   while (output[start] == 0) {
    if (start == d) {
     break;
    }
    start++;
   }

   while (start < d) {
    System.out.print(output[start]);
    start++;
   }
   System.out.println();
  }
 }
}

*/