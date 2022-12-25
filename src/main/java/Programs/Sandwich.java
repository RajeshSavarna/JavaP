package programs;
/*
A sandwich is two pieces of 'bread' with something in between.
Secrete Sandwich String is a string having same N characters (Wrapper text)
at the beginning of string and end of string. But they are in the reverse order at the end. 
This string contains some text which is in between this wrapper. 
Now your task is to write a program to find out the this text.

Sample Input 1 : breadJamdaerb
Sample Output 1 : Jam

Sample Input 2 : abcxyzcba
Sample Output 2 : xyz

Explaination : 
String abcxyzcba contains "abc" at the begaining and at the end in reverse order (cba). 
that means Wrapper text is "abc". Now the remaining text is "xyz". So output will be xyz
Note : 
If no wrapper text is found then print "Invalid String"
*/
import java.util.Scanner;
class Sandwich {
    public static void main(String...asd) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), str2 = "", str3 = "";
        int l = str.length(), c = 0;
        for (int i=0; i<l/2; i++) {
            str2 = str2+str.charAt(i);
            str3 = str3+str.charAt((l-1)-i);
            if (str2.equals(str3)) c+=1;
        }
        System.out.println(c==0?"Invalid String":str.substring(c,l-c));
    }
}