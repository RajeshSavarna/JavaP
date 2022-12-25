package programs;
/*
Given two strings, return true if either of the strings appears 
at the very end of the other string, ignoring upper/lower case differences 
(in other words, the computation should not be "case sensitive"). 
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc")  true
endOther("AbC", "HiaBc")  true
endOther("abc", "abXabc")  true
*/
class endOther
{
	public static void main(String[] args) 
	{
		String a="hiabc", b="abcd";
		String aLow = a.toLowerCase();
		String bLow = b.toLowerCase();
		if (aLow.endsWith(bLow) || bLow.endsWith(aLow)) {
			System.out.println("true");
		}
		else System.out.println("false");
	}
}
