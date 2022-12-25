package programs;
/*
Priyanka an elite CBI agent have been working on a cyber crime case has intercepted an electronic safe which can be opened by an set of 4 digit pin. Now these 4 digit pins are actually the word count of a corresponding sentences.
Priyanka has received a bunch of sentences from one of her mole and need your help in generating the pin
Input Sentences
Sentence #1: Good morning
Sentence #2: India is a democratic country
Sentence #3: Long live the revolution
Sentence #4: Rights to speech
Pin: 2543
Your are requested to write a java program to generate the pin and save your country. Jai Hind..!!
Input Specification :
Four Sentences in consecutive line
Output Specification :
Ouput would be a 4 digit PIN
Sample input :
Good morning
India is a democratic country
Long live the revolution
Rights to speech
Sample output :
2543
Sample Input:
Why won't each wisdom exceed any incorporated junk?
Why can't every overtone walk around the merry sail?
When will the glad market switch the circulating tray? 
Sample Output:
8990
Hint: All sentences word count would be less than 10
*/

/*
import java.util.Scanner;
class JaiHind {
    public static void main(String...asd) {
        Scanner sc = new Scanner(System.in);
        int ans[]=new int[4], i=0;
        while(sc.hasNextLine()) {
            ans[i] = ((sc.nextLine()).split(" ")).length;
            i++;
        }
        for (int res : ans) System.out.print(res);
    }
}
*/
/*
import java.util.Scanner;
class JaiHind {
    public static void main(String...asd) {
        Scanner sc = new Scanner(System.in);
        int ans[]=new int[4], i=0;
        while(i<4) {
            ans[i] = ((sc.nextLine()).split(" ")).length;
            ++i;
        }
        for (int res : ans) System.out.print(res);
    }
}
*/