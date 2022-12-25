package programs;
/*
Write a program that will remove the vowels from a string and print the remaining string in alphabetical order.
Assume that only a proper string will given as input.
Sample Input: Shriram Sample Output: hmrrS
*/
import java.util.*;
class RemoveVowelAndSort1
{
	public static void main(String[] args) 
	{
		String str = "Shriram";
		str = str.replaceAll("[AaEeIiOoUu]", "");
		char tempArray[] = str.toCharArray(); 
        Arrays.sort(tempArray); 
		System.out.println(tempArray);
	}
}
