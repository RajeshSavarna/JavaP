package programs;
/*
1)Write a program to find out the number of days elapsed between two given dates. 
The input to your program is (again) six integers dd mm yyyy dd mm yyyy 
and the program should output the intervening number of days between these two dates. 
Assume that the inputs are always valid and the first date is earlier than the second date. 

Sample input 1 1 1900 2 1 1900 
Output 1

2)Given a sentence, write a program to arrange and print the words in the sentence such that 
the last letter of the previous word is same as the first letter of the next word. 
Assume the first word is correctly placed in order and start arranging the others. 

Sample Input - mediocre yielding dedication nationality educated 
Sample Output - mediocre educated dedication nationality yielding

3)Write a java program to print the number of occurrences of a sub array in an array. 
The input contains four lines. The first line specifies n, the number of elements in the main array. 
The second line specifies n integers separated by space. 
The third line contains k, the size of sub-array and the fourth line contains k integers forming the sub-array.

Sample: Input:
10
1 2 3 4 2 3 7 2 3 10
2
2 3

Output:
3

4)Write a java program to shift the array elements by k terms

Sample: Input: 5 1 2 3 4 5 3 
Output: 3 4 5 1 2 

Explanation: Array of size 5 i.e, {1, 2, 3, 4, 5} is shifted to k places, which is 3.
So the values in the each index position"s are shifted by 3 places, producing the output as {3, 4, 5, 1, 2}

5)Write a program that prints the sum of all the numbers appearing in that string ignoring the characters. 
If a string does not contain any numbers it should print zero.

Input specification:
The input consists of two parts the first part contains a integer n that species the 
number of strings given as input. The next n lines consists of n strings that is given as input.

Output Specification:
The ouput consists on n lines of numbers. Each testcase is seperated by a newline character.

Sample Input
3
abc123xyz
aa11b33
7 11

Sample Output:
123
44
18

6)It is your first day at work and you find out that your desk has a huge pile of sheets.
You wonder what it is about so you go to your boss to find out.
It turns out that all the sentences in that sheet have errors and the software that could correct the errors 
is not working. So you have to do it manually. 
Write a program to reverse each word in the sentence and have each word's first letter (and only the first letter)
capitalized. This should make your task simple. 

Sample Input ym eman Si nhOj 
Sample Output My Name Is John

7)Write a program that calculates the sum of odd terms of a given series. 
 The input to your program is three integers a, d and l.
 They stand for the first, difference and the last term respectively of the series.
 Your program should output an integer that corresponds to the 
 sum of alternating terms starting from the first term. -1000 <= a, d <= 1000 -1000000 <= l <= 1000000
 
 Sample input 1 1 10 
 Expected output 25


8)Take an array of inputs and print them in the same order.
 Your program should skip the number when it is a prime number and stop printing if it encounters a 0.
*/

/*
//Question No.8
import java.util.Scanner;
class Program {
    public static void main(String...arguments) {
        Scanner sc = new Scanner(System.in);
        String result = "";
		int temp = 0;
		while (sc.hasNextInt()) {
			temp = sc.nextInt();
			if (temp == 0){
                break;
            }
			else if (isPrime(temp)){ //write the conditions for checking prime number
				continue;
			}
			else {
				result += temp;
				result += " "; 
			}
		}
		System.out.println(result);
	}
	static boolean isPrime(int n) {
		if ( n <= 1)
			return false;
		for ( int i = 2; i < Math.sqrt(n) ; i++ ) {
			if ( n % i == 0)
				return false;
		}
		return true;
	}
}
*/


/*
//Question No.2
import java.util.Scanner;
//import java.util.Arrays;
class Program {
    public static void main(String...arguments) {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt(); // size of main array
			int arr[] = new int[n];
			for ( int i = 0 ; i<n ; i++ )
				arr[i] = sc.nextInt();
			
			n = sc.nextInt(); // size of sub array
			int arr1[] = new int[n];
			for ( int i = 0 ; i<n ; i++ )
				arr1[i] = sc.nextInt();
			
			//String str = "1 2 3 4 2 3 7 2 3 10";
			//String str = Arrays.toString(arr);
			//String findStr = "2 3";
			//String findStr = Arrays.toString(arr1);
			String str = "", findStr = "";
			for (int in : arr ) {
				str += in;
				str += " ";
			}
			for (int in : arr1 ) {
				findStr += in;
				findStr += " ";
			}
			int lastIndex = 0;
			int count = 0;
			
			//System.out.println(str+"\t"+findStr);
			

			while(lastIndex != -1){

				lastIndex = str.indexOf(findStr,lastIndex);

				if(lastIndex != -1){
					count ++;
					lastIndex += findStr.length();
				}
			}
			System.out.println(count);
	}
}
*/


/*
//Question No.5
import java.util.Scanner;
class Program {
    public static void main(String...arguments) {
			Scanner sc = new Scanner(System.in);
			//String str = sc.nextLine();
			int n = new Scanner(System.in).nextInt();
			String result = "";
			for (int loop = 1; loop<=n ; loop++ )
			{
					String str = sc.nextLine();
					str=str.replaceAll("[\\D]+"," ");
					String[] numbers=str.split(" ");
					int sum = 0;
					for(int i=0;i<numbers.length;i++){
						try{
							sum+=Integer.parseInt(numbers[i]);
						}
						catch( Exception e ) {
						  //Just in case, the element in the array is not parse-able into Integer, Ignore it
						}
					}
					result = result + "\n" + sum;
			}
			System.out.println(result);
		}
}
*/


/*
//Question No.6
import java.util.Scanner;
class Program {
    public static void main(String...arguments) {
	Scanner sc = new Scanner(System.in);
	//String str = sc.nextLine();
	String str = "ym eman Si nhOj";
	str = str.toLowerCase();
	StringBuilder resultBuilder = new StringBuilder();
    for (String string : str.split(" ")) {
        String revStr = new StringBuilder(string).reverse().toString();
        revStr = Character.toUpperCase(revStr.charAt(0))
                + revStr.substring(1);
        resultBuilder.append(revStr).append(" ");
    }
    System.out.println(resultBuilder.toString());
    }
}
*/



/*
//Question No.2
import java.util.Scanner;
class Program {
    public static void main(String...arguments) {
        Scanner sc = new Scanner(System.in);
        //String sentence[] = sc.nextLine().split(" ");
		String sentence[] = "mediocre yielding dedication nationality educated".split(" ");
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