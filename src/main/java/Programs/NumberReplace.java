package programs;
import java.util.Scanner;
class NumberReplace 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		replace(str);
		
		String res = replace1(str);
		System.out.println(res);

		String res1 = replace2(str);
		System.out.println(res1);
	}

	// 1st method
	static void replace(String str)
	{
		char[] ch = str.toCharArray();
		for (int i=0 ; i<str.length() ; i++ )
		{
			if (Character.isDigit(ch[i]))
			{
				int n = Character.getNumericValue(ch[i]);
				for (int j=1; j<n ; j++ )
					System.out.print(ch[i+1]);
			}
			else System.out.print(ch[i]);
		}
		System.out.println();
	}

	// 2nd method
	static String replace1(String str)
	{
		String res = "";
		for (int i=0 ; i<str.length() ; i++ )
		{
			if (Character.isDigit(str.charAt(i)))
			{
				int n = Integer.parseInt(String.valueOf(str.charAt(i)));
				for (int j=1; j<n ; j++ ) res+=str.charAt(i+1);
			}
			else res+=str.charAt(i);
		}
		return res;
	}

	// 3rd method
	static String replace2(String str)
	{
		String res = "";
		for (int i=0 ; i<str.length() ; i++ )
		{
			if (str.substring(i,i+1).matches("[0-9]"))
			{
				int n = Integer.parseInt(str.substring(i,i+1));
				for (int j=1; j<n ; j++ ) res+=str.substring(i+1,i+2);
			}
			else res+=str.substring(i,i+1);
		}
		return res;
	}
}