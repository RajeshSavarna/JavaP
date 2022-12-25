//package programs;
//
//
///*
//OI Impact Assignment - 3
//
//Question 1 of 5 (Pattern3 ) Next →
//Write a code foe displaying the following output.
//# # # # # # # # # # # # # # # # # # # 
//*/
//
//public class Pattern3
//{
//    public static void main(String[] args)
//    {
//        int t=0, z=15; 
//        for(int i=0; i<7; i++)
//        {
//            if (i!=6 && i!=0){
//            for (int k=0; k<z && i!=6 && i!=0; k++)
//                System.out.print(" ");
//            z-=3;
//            }
//            for(int j=0; j<7; j++)
//            {
//                if (j==6)
//                {
//                    if (t==0 || t==6)
//                        System.out.print("#");
//                    else
//                    {   
//                        System.out.print("#");
//                        break;
//                    }
//                }
//                else
//                {
//                     if (t==0 || t==6)
//                        System.out.print("# ");
//                    else
//                    {
//                        System.out.print("#");
//                        break;
//                    }
//                }
//            }
//            t++;
//            System.out.println();
//        }
//    }
//}
//
//Question 2 of 5 (Pattern11 ) Next →
//Write the code to print the following pattern:
//8 7 6 5 4 3 2 1
//7 6 5 4 3 2 1
//6 5 4 3 2 1
//5 4 3 2 1
//4 3 2 1
//3 2 1
//2 1
//1
//
//public class Pattern11
//{
//    public static void main(String[] args)
//    {
//        for (int i=8; i>0; i--)
//        {
//            for (int j=i; j>0; j--)
//            {
//                if (j==1)
//                    System.out.print(j);
//                else
//                    System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//Question 3 of 5 (Pattern14 ) Next →
//Write the code to print the following pattern.
//1 1 1 2 2 1 1 2 3 3 2 1 1 2 3 4 4 3 2 1 1 2 3 4 5 5 4 3 2 1 1 2 3 4 5 6 6 5 4 3 2 1 1 2 3 4 5 6 7 7 6 5 4 3 2 1 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
//
//import java.util.Scanner;
//public class Pattern14
//{
//    public static void main(String args[])
//    {
//        int n=8, l=40;
//        for (int i=n; i>=1; i--)
//        {
//            for (int k=1; k<=n-(i-1); k++)
//            {
//                //if (k==n-(i-1))
//                  //  System.out.print(k);
//                //else
//                    System.out.print(k+" ");
//            }
//            for (int j=1; j<=l; j++)
//            {
//                if (j==1)
//                    continue;
//                else
//                System.out.print(" ");
//            }
//                l-=6;
//            for (int k=n-(i-1); k>=1; k--)
//            {
//                if (k==8)
//                    continue;
//                if (k==1)
//                    System.out.print(k);
//                else
//                    System.out.print(k+" ");
//            }
//                
//            System.out.println();
//        }
//    }
//}
//
//Question 4 of 5 (Arithmetic Progression ) Next →
//Write a Java program to print the nth term of an arithmetic progression (AP).
//Your program should take three integers corresponding to the first term,
//common difference and n as input and print the nth term in a line by itself.
//In AP series, nth term=first term+(n-1)* common difference.
//Sample input
//1 5 10
//Expected output
//46
//
//import java.util.Scanner;
//public class Ap
//{
//    public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        int first=sc.nextInt();
//        int diff=sc.nextInt();
//        int n=sc.nextInt();
//        System.out.print(first+(n-1)*diff);
//    }
//}
//
//Question 5 of 5 (String pattern ) Next →
//Write a program to take String input from user and print it in the following pattern :
//Sample Input : ABCDEF 
//Sample output : A B C D E F B C D E C D
//Sample Input : HeLlO
//Sample Output : H e L l O e L l L
//
//import java.util.Scanner;
//public class Sp
//{
//    public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        
//        for (int i=0; i<Math.ceil(str.length()/2.0); i++)
//        {
//            String temp = str.substring(i,str.length()-i);
//            System.out.print(temp.replace(""," ").trim()+"\n");
//        }
//    }
//}
//		
//
//
//
//
//
//									OI Impact Assignment - 4
//
//Question 1 of 4 (Pattern 1 ) Next →
//Write a Java program to generate the pascal triangle pattern .
//Print a space after each line. Example : 
//Input: 3
//Output: 1 2 3 2 1 1 2 1 1
//
//import java.util.Scanner;
//public class Pattern
//{
//    public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int t=n;
//        for (int i=0; i<n; i++)
//        {
//            for (int j=0; j<i; j++)
//                System.out.print("  ");
//            for (int k=1; k<=n-i; k++)
//                System.out.print(k+" ");
//            for (int m=--t; m>0; m--)
//                System.out.print(m+" ");
//            System.out.println();
//        }
//    }
//}
//
//Question 2 of 4 (Pattern_2 ) Next →
//Write a java program using for loop to print the pattern. Example :
//Input : 7
//Output: ####### # # # # # #######
//
//import java.util.Scanner;
//public class Pattern{
//    public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int t=0;
//        for (int i=0; i<n; i++)
//        {
//            for (int k=0; k<i && i!=n-1; k++)
//                System.out.print(" ");
//            for (int j=0; j<n; j++)
//           {
//                if (t==0 || t==n-1)
//                    System.out.print("#");
//                else
//                {
//                    System.out.print("#");
//                    break;
//                }
//           }
//            t++;
//            System.out.println();
//        }
//    }
//}
//
//Question 3 of 4 (Pattern_8 ) Next →
//Write a java program using for loop to print the pattern .
//Input specification : Take an integer value from the user.
//Output specification : If the integer number is odd then print the pattern else print "Not possible".
//Example : Input: 6 Output: Not possible
//Input: 7
//Output: # ### ##### ####### ##### ### #
//
//import java.util.Scanner;
//public class Pattern
//{
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int t=1;
//        if (n%2==0)
//        {
//            System.out.print("Not possible");
//            return;
//        }
//        for (int i=0; i<n/2; i++)
//        {
//            for (int j=i; j<n/2; j++)
//                System.out.print(" ");
//            for (int k=0; k<=i*2; k++)
//                System.out.print("#");
//            System.out.println();
//        }
//        
//        for (int i=0; i<(n+1)/2; i++)
//        {
//            for (int j=0; j<i; j++)
//                System.out.print(" ");
//            for (int k=n-i*2; k>0; k--)
//                System.out.print("#");
//            System.out.println();
//        }
//    }
//}
//
//Question 4 of 4 (Pattern_10 ) Next →
//Write a java program using for loop to print the pattern. Example :
//Input : 7
//Output: 1 2 3 4 5 6 7 1 2 3 4 5 6 1 2 3 4 5 1 2 3 4 1 2 3 1 2 1
//
//import java.util.Scanner;
//public class Pattern10
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int t=n;
//        for (int i=0; i<n; i++)
//        {
//            for (int j=0; j<i; j++)
//                System.out.print("  ");
//            for (int k=1; k<=t; k++)
//                System.out.print(k+" ");
//            t--;
//            System.out.println();
//        }
//    }
//}