package programs;
import java.util.*;
class Shubham
{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int count=3;
for(int i=n; i>=1; i--){
for(int j=1; j<=i; j++){
if(j!=n)
System.out.print(j+" ");
}
}
}
}
/*for(int k=1; k<3count; k++){
	if(i!=n)
System.out.print(" ");
}
if(i!=n)
count+=4;
for(int j=i; j>=1; j--){
System.out.print(j+" ");
}
System.out.println();
}
}
}
*/                                     