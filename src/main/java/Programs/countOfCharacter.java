package programs;
/*
Write a programme to get a presence of a character in a string with the count.
Input Specification :
First input is a sentence.
Second input is a single character.

Output Specification:
Print the count of character in a sentence.

Sample Input :
This is Ignite
i

Sample Output :
4
*/
class countOfCharacter
{
	public static void main(String[] args) 
	{
		String someString = "elephantE";
		char someChar = 'e';
		int count = 0;
		  
		for (int i = 0; i < someString.length(); i++) {
			if (Character.toLowerCase(someString.charAt(i)) == Character.toLowerCase(someChar)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
