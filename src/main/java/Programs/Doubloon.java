package programs;
/*
A word is said to be a doubloon if every letter that appears in the word appears exactly twice.

For example, the following are all the doubloons I found in my dictionary.

Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bilabial, Caucasus, coco, Dada, deed, Emmett, Hannah, horseshoer, intestines

Write a program to check whether the given words are doubloon or not.

Input specification:

First line is to accept "number of words" from 2nd line it should accept "n" number of words and print the result in the format "givenword is/not a doubloon"

Sample Output1:

4

Abba

Anna

appall

java

Sample Output:

Abba is a doubloon

Anna is a doubloon

appall is a doubloon

java is not a doubloon

Source Code :
*/
import java.util.Scanner;

class Doubloon{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int t=s.nextInt();
for(int i=0;i<t;i++){
String txt=s.next();
String temp=txt.toLowerCase();
int l=temp.length();
int flag=0;
for(int j=0;j<l && l%2==0;j++){
int len=temp.replace(temp.charAt(j)+"","").length();
if(len%2!=0){
flag=1;
break;
}
}
if(flag==0){
System.out.println(txt + " is a doubloon");
}else{
System.out.println(txt + " is not a doubloon");
}
}
}
}