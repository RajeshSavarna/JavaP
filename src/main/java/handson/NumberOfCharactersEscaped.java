package handson;

public class NumberOfCharactersEscaped {

	
	// Complete the numberOfCharactersEscaped function below. 
    public static int numberOfCharEscaped(String str)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '#')
            {
                while(++i < str.length() && str.charAt(i) != '#')
                {
                    if(str.charAt(i) == '!')
                    {
                        if(Character.toString(str.charAt(i+1)).matches("[a-z]"))
                        {
                            i++;
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    
 // Complete the numberOfCharactersEscaped function below.    
    public static int numberOfCharactersEscaped(String expression) {
        int begin = 0;
        int length = expression.length();
        int end = 0;

        int escapeCount = 0;
        int numberSignCount = 0;

        while (end < length) {
            if (expression.charAt(end) == '#') {
                numberSignCount++;

                if (numberSignCount == 1) {
                    begin = end;
                }
            }

            if (numberSignCount == 2) {
                escapeCount += getEscapeCount(begin, end, expression);
                begin = end;
                numberSignCount = 0;
            }

            end++;
        }

        return escapeCount;
    }

    private static int getEscapeCount(int start, int end, String expression) {
        int count = 0;
        while (start <= end) {
            if (expression.charAt(start) == '!' && Character.isLowerCase(expression.charAt(start + 1))) {
                count++;
            }
            start++;
        }

        return count;
    }
    
    
    public static void main(String []args)
    {
        // System.out.println(numberOfCharEscaped("#ab!c#de!f"));
        // System.out.println(numberOfCharEscaped("##!r#po#"));
        // System.out.println(numberOfCharEscaped("###!c!r###po##"));
        // System.out.println(numberOfCharEscaped("###!c!r###p!o##"));
        // System.out.println(numberOfCharEscaped("#####!ab!c!###"));
        // System.out.println(numberOfCharEscaped("#!a#!b#!c##"));
        // System.out.println(numberOfCharEscaped("#!##a!b#"));
        System.out.println("numberOfCharEscaped : " + numberOfCharEscaped("a!de#dwx!re!e##!##sdc!a!f"));
        System.out.println("numberOfCharEscaped : " + numberOfCharEscaped("#uv!#!lcr#f!#d!!v!##nwy!t!#i!vpz!kaxc!oj#!#!!d!!k!e#!!qs!rivzj#sqjlf#pe#v!cd!!!nst#je!##qthb#t!!ty#v!hj"));

        System.out.println("numberOfCharactersEscaped : " + numberOfCharactersEscaped("a!de#dwx!re!e##!##sdc!a!f"));
        System.out.println("numberOfCharactersEscaped : " + numberOfCharactersEscaped("#uv!#!lcr#f!#d!!v!##nwy!t!#i!vpz!kaxc!oj#!#!!d!!k!e#!!qs!rivzj#sqjlf#pe#v!cd!!!nst#je!##qthb#t!!ty#v"));
}
}