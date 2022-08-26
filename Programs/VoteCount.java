/*

It"s election day. Write a program that counts votes cast and prints the person who won. Input: 1st line will contain the number of candidates. The next lines will contain 1 vote per line. The vote will be the serial number of the candidate. So for ten candidates, possible inputs are 1-10. Keep taking input till you get 0. Inputs are such that the highest vote-getter has unique number of votes. Output: 1st line will contain the serial number of the candidate who won. 2nd line will contain the number of votes that he/she got.


Sample input: 


3


1


1


1


2


2


3


0


Sample output: 


1


3

*/

import java.util.*;
class VoteCount
{
public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int vote=0,max=0,winner=0,temp=0;
    int arr[]=new int[num];
    while((vote = sc.nextInt())!=0)
    {
        
        temp=vote-1;
        arr[temp]=arr[temp]+1;
        temp=arr[temp];
        if(max<temp)
        {
            max=temp;
            winner=vote;
        }
    }
        System.out.println(winner+"\n"+max);
}
}