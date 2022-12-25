package programs;

import java.util.*;
class TicTacToe
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String P1,P2;
int i,j,c='0',n=1,ch;
boolean flag1,flag2,flag3=false;
System.out.println("Type name of player 1");
P1=sc.nextLine();
System.out.println("Type name of player 2");
P2=sc.nextLine();
System.out.println("\n"+P1+" will enter 'X'\n"+P2+" will enter 'O'");
char Ar1[][]={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
char Ar2[][]={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
System.out.println("\nGeneral Form (1,2,3,... indicate the place number):");
System.out.println("+---+---+---+");
System.out.println("| "+Ar1[0][0]+" | "+ Ar1[0][1]+" | "+Ar1[0][2]+" |");
System.out.println("+---+---+---+");
System.out.println("| "+Ar1[1][0]+" | "+ Ar1[1][1]+" | "+Ar1[1][2]+" |");
System.out.println("+---+---+---+");
System.out.println("| "+Ar1[2][0]+" | "+ Ar1[2][1]+" | "+Ar1[2][2]+" |");
System.out.println("+---+---+---+");
while(n<=9)
{
do
{
flag1=true;
flag2=false;
if(n%2==1)
System.out.println("\n"+P1+"'s turn (enter place no. where you want to take chance)");
else
System.out.println("\n"+P2+"'s turn (enter place no. where you want to take chance)");
ch=sc.nextInt();
if(ch<1 || ch>9)
{
System.out.println("Out of range, try again");
flag1=false;
}
else
{
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if((int)Ar1[i][j]==(ch+48))
{
flag2=true;
if(n%2==1)
{
Ar2[i][j]='X';
Ar1[i][j]=Ar2[i][j];
}
else
{
Ar2[i][j]='O';
Ar1[i][j]=Ar2[i][j];
}
break;
}
}
}
if(flag2==false)
System.out.println("Place already filled, try again");
}
}
while(flag1==false || flag2==false);
System.out.println("+---+---+---+");
System.out.println("| "+Ar2[0][0]+" | "+ Ar2[0][1]+" | "+Ar2[0][2]+" |");
System.out.println("+---+---+---+");
System.out.println("| "+Ar2[1][0]+" | "+ Ar2[1][1]+" | "+Ar2[1][2]+" |");
System.out.println("+---+---+---+");
System.out.println("| "+Ar2[2][0]+" | "+ Ar2[2][1]+" | "+Ar2[2][2]+" |");
System.out.println("+---+---+---+");
if(n>=5)
{
if((Ar1[0][0]==Ar1[1][1] && Ar1[1][1]==Ar1[2][2]) || (Ar1[0][2]==Ar1[1][1] && Ar1[1][1]==Ar1[2][0]))
{
if(Ar1[1][1]=='X')
System.out.print("\nCongratulations "+P1+", you win it playing diagonally");
else if(Ar1[1][1]=='O')
System.out.print("\nCongratulations "+P2+", you win it playing diagonally");
flag3=true;
}
for(i=0;i<3;i++)
{
if(Ar1[i][0]==Ar1[i][1] && Ar1[i][1]==Ar1[i][2])
{
if(flag3==true)
System.out.println(" and also in row "+(i+1));
else
{
if(Ar1[i][0]=='X')
System.out.print("\nCongratulations "+P1+", you win it playing in row "+(i+1));
else if(Ar1[i][0]=='O')
System.out.print("\nCongratulations "+P2+", you win it playing in row "+(i+1));
}
flag3=true;
}
if(Ar1[0][i]==Ar1[1][i] && Ar1[1][i]==Ar1[2][i])
{
if(flag3==true)
System.out.println(" and also in column "+(i+1));
else
{
if(Ar1[0][i]=='X')
System.out.print("\nCongratulations "+P1+", you win it playing in column "+(i+1));
else if(Ar1[0][i]=='O')
System.out.print("\nCongratulations "+P2+", you win it playing in column "+(i+1));
}
flag3=true;
}
}
}
if(flag3==true)
break;
n++;
}
if(flag3==false)
System.out.println("\nIt is a draw");
}
}