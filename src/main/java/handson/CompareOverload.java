/*
1. How Will You Compare?
Write a Comparator class with the following 3 overloaded compare methods:

 

boolean compare(int a, int b): Return true if int a = int b, otherwise return false.
boolean compare(string a, string b): Return true if string a = string b, otherwise return false.
boolean compare(int[] a, int[] b): Return true if both of the following conditions hold true: Otherwise, return false.
Arrays a and b are of equal length.
For each index i (where 0 ≤ i < |a|, |b|), a[i] = b[i].
 

Note: For C++, both parameters are of type Vector<int>.

 

 

Constraints

For strings, 1 ≤ |a|, |b| ≤ 2000
For integers, 0 ≤ a, b ≤ 10000000
For integer arrays, 0 ≤ |a|, |b| ≤ 10
 

Input Format for Custom Testing
Sample Case 0
Sample Input 0

STDIN          Function
-----          -------- 
3           →  T = 3 number of test cases.
1           →  Comparison type 1
hello world →  a = "hello world"
hello world →  b = "hello world"
2           →  Comparison type 2
3           →  a = 3
4           →  b = 4
3           →  Comparison type 3
3 3         →  a[] size n=3  b[] size m=3
1 2 3       →  a = [1, 2, 3]
1 2 3       →  b = [1, 2, 3]
 

Sample Output 0

Same
Different
Same
 

Explanation 0

There are 3 test cases:

 

Test Case	
comparison 

type

a	b	Output	Explanation
1	1	"hello world"	"hello world"	"Same"	Both strings are the same.
2	2	3	4	"Different"	The two integers are different (3 ≠ 4).
3	3	{1,2,3}	{1,2,3}	"Same"	Both arrays have the same number of elements and each element a[i] = b[i]
 

Sample Case 1
Sample Input 1

STDIN     Function
-----     --------
2          →  T = 2 number of test cases. 
3          →  Comparison type 3
3 4        →  a[] size=3 b[] size=4
1 2 3      →  a = [1, 2, 3]
1 2 3 4    →  b = [1, 2, 3, 4]
1          → Comparison type 1
HackerRank → a = "HackerRank" 
HackerRank → b = "HackerRank" 
 

Sample Output 1

Different
Different
 

Explanation 1

There are 2 test cases.

Test Case	
comparison 

type

a	b	Output	Explanation
1	3	{1, 2, 3}	{1, 2, 3, 4}	"Different"	The arrays are different.
2	1	
HackerRan
*/


import java.util.*;

/*Write your code here. DO NOT use access modifiers (e.g.: 'public') in your class declarations.*/
class Comparator {
    public boolean compare(int a, int b) {
        if(a == b) return true;
        else return false;
    }
    
    public boolean compare(String a, String b) {
        if(a.equals(b)) return true;
        else return false;
    }
    
    public boolean compare(int[] a, int[] b) {
        if(a.length == b.length) { 
            for (int i = 0 ; i < a.length ; i++) {
                if(a[i] != b[i]) return false;
            }
            return true; 
        }
        else return false;
    }
}

class CompareOverload {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Comparator comp = new Comparator();
        
        int testCases = Integer.parseInt(scan.nextLine());
        while(testCases-- > 0){
            int condition = Integer.parseInt(scan.nextLine());
            switch(condition){
                case 1:
                    String s1=scan.nextLine().trim();
                    String s2=scan.nextLine().trim();
                    
                    System.out.println( (comp.compare(s1,s2)) ? "Same" : "Different" );
                    break;
                case 2:
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    
                    System.out.println( (comp.compare(num1,num2)) ? "Same" : "Different");
                    if(scan.hasNext()){ // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
                case 3:
                    // create and fill arrays
                    int[] array1 = new int[scan.nextInt()];
                    int[] array2 = new int[scan.nextInt()];
                    for(int i = 0; i < array1.length; i++){
                        array1[i] = scan.nextInt();
                    }
                    for(int i = 0; i < array2.length; i++){
                        array2[i] = scan.nextInt();
                    }
                    
                    System.out.println( comp.compare(array1, array2) ? "Same" : "Different");
                    if(scan.hasNext()){ // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
                default:
                    System.err.println("Invalid input.");
            }// end switch
        }// end while
        scan.close();
    }
}