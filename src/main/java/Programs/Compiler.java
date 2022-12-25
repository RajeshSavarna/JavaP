package programs;
/*
You are converting an old code for a new version of the compiler. 
In the old code we have used "->" for pointers. But now we have to replace each "->" with a ".".
But this replacement shouldn't be done inside comments. 
A comment is a string that starts with "//" and terminates at the end of the line.

Input specification:
A line of code

Output specification:
New code with required changes.

Sample Input:
t->0; //t-> is a comment

Sample Output:
t.0; //t-> is a comment

*/

import java.util.Scanner;

class Compiler{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int index=str.indexOf("//");
        System.out.print(str.substring(0,index).replace("->",".")+str.substring(index));
    }
}