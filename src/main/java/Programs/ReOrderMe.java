package programs;
/*
Given a sentence, write a program to arrange and print the words in the sentence such that 
the last letter of the previous word is same as the first letter of the next word. Print the arranged sentence. 

Sample Input - first impulse gruff toni 
Sample Output - gruff first toni impulse
last = sentence[i].charAt(sentence[i].length()-1);
           first = sentence[i].charAt(0);
*/

import java.util.Scanner;
class ReOrderMe {
    public static void main(String...arguments) {
        Scanner sc = new Scanner(System.in);
        String sentence[] = sc.nextLine().split(" ");
		//String sentence[] = "first impulse gruff toni".split(" ");
        String temp = sentence[0];
		String nMatch = "";
        char first,last;
        
        for (int i=1; i<sentence.length; i++) {
		   last = temp.charAt(temp.length()-1);
           first = temp.charAt(0);
           if (sentence[i].charAt(0) == last)
           {
			   temp = temp +" "+ sentence[i];
           }
		   else if (sentence[i].charAt(sentence[i].length()-1) == first)
           {
			   temp = sentence[i] +" "+ temp;
           }
		   else
			   nMatch = sentence[i];
        }
        
		System.out.println(temp+" "+nMatch);
    }
}


/*

import java.util.Scanner;
class ReOrderMe {
    public static void main(String...arguments) {
        Scanner sc = new Scanner(System.in);
        String sentence[] = sc.nextLine().split(" ");
        String temp = sentence[0];
        String nMatch = "";
        char first,last;
        
        for (int j=0; j<sentence.length; j++) {
        for (int i=0; i<sentence.length; i++) {
            last = temp.charAt(temp.length()-1);
            first = temp.charAt(0);
            if (!nMatch.contains(""+i))
            {
                if (last == sentence[i].charAt(0))
                {
                    temp = temp +" "+ sentence[i];
                    nMatch = nMatch + " "+i;
                }
                else if (first == sentence[i].charAt(sentence[i].length()-1))
                {
                    temp = sentence[i] +" "+ temp;
                    nMatch = nMatch + " "+i;
                }
                //else
                    //nMatch = nMatch + " "+ sentence[i];
            }
        }
        }
        
        System.out.print(temp);
    }
}

*/