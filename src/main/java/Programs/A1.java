package programs;
class A1 
{
	public static void main(String[] args) 
	{
		String str = "New Delhi and Delhi are the same.";

		System.out.println("abc".indexOf('u'));
		System.out.println(str.indexOf('i') + " " +str.lastIndexOf('i'));
		System.out.println(str.indexOf('e', 1) + " " +str.lastIndexOf('e', 3));
		System.out.println(str.indexOf("Delhi") + " " +str.lastIndexOf("Delhi"));
		System.out.println(str.indexOf("Delhi", 3) + " " +str.lastIndexOf("Delhi", 15));

		String word1 = "ripple";
		String word2 = "ripple".replace('p', 'd'); 
		String str1 = "New Delhi and Delhi are the same.";
		System.out.println(str1.replaceAll("Delhi", "Bombay")+"......."+word1+word2);
		System.out.println(str1.replaceFirst("Delhi", "Bombay"));

		int n=0456;
		float x=23888;
		double d=4.567;
		double d1=0x443;
		int m=0xAD12;
		int n1=0b110011100;
		System.out.println(n+" "+n1+" "+m);
		System.out.println(d+" "+x+" "+d1);

		
		byte b=5, b1=10;
		double v=b*b1;
		System.out.println(v);

		int k=8;
		k=k&k+1;
		k=k<<k/2;
		System.out.println(k);
		int s=-17,s1=-6;
		System.out.println(s%s1);

		b1=2; int b2=2;
		boolean b3=(++b2>2)||(b1++>2);
		System.out.println(b1+" "+b2);
		System.out.println(8|12^8);
		System.out.println(020);
		System.out.println(8^5&6);
		System.out.println((1|4)+(4&2));
		float h=(1/4)*10;
		System.out.println(h);
		System.out.println(9.0/0);
		System.out.println(-8>>>1);
		int im=6,jk=2;
		System.out.println(im++*6+3-4+--jk);
		int y=1; int z=5; x=0-(++y)+z++;
		System.out.println(x+" "+y+" "+z);
		System.out.println(10%3==2);
		System.out.println(3*4/3*9<1 || 2*2/3*9<999);		
		boolean ki=false;
		if (ki=true)
		{
			System.out.println("ok");
		}
		
		System.out.println(Byte.parseByte("12"));
		System.out.println(Byte.toString((byte)12)+1);
		System.out.println(Integer.parseInt("12"));
		System.out.println(Integer.parseInt("111",2));
		System.out.println(Integer.parseInt("111",8));
		System.out.println(Integer.parseInt("111A",16));
		System.out.println(Integer.toString(123)+1);
		System.out.println(Integer.toString(1234,2));
		System.out.println(Integer.toString(1234,8));
		System.out.println(Integer.toString(1234,16).toUpperCase());
		System.out.println(Integer.toBinaryString(1234));
		System.out.println(Integer.toHexString(1234));
		System.out.println(Integer.toOctalString(1234));
		System.out.println(Double.parseDouble("1234"));
		System.out.println(Double.toHexString(1234.1));

		System.out.println(Character.isLetter('J'));
		System.out.println(Character.isDigit('4'));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println(Character.isUpperCase('J'));
		System.out.println(Character.isLowerCase('J'));
		System.out.println(Character.toUpperCase('J'));
		System.out.println(Character.toLowerCase('s'));
		System.out.println(Character.isUpperCase('J'));
		System.out.println(Character.isLetterOrDigit('J'));
		//System.out.println(Character.codePointAt('J'));
		//System.out.println('a'.compareTo('J'));
		Float cc = new Float(123456f);
		System.out.println(cc.intValue());

		
		System.out.println();
		System.out.println(Math.min(3.01,(int)3.5));
		System.out.println(Math.max(3.01,(int)3.5));
		System.out.println((int)Math.random());
		System.out.println(Math.nextAfter(1,1));
		System.out.println(Math.signum(-1));
		System.out.println(Math.floor(1.321));
		System.out.println(Math.round(-1.5));
		System.out.println(Math.nextUp(1.46f));
		System.out.println(Math.copySign(1,-1));
		System.out.println(Math.hypot(3,4));
		System.out.println(Math.abs(3.01));
		System.out.println(Math.pow(1,0));
		System.out.println(Math.pow(-1,2.01));
		System.out.println(Math.ceil(-0.1));
		System.out.println(Math.log10(-1));
		//System.out.println(Math.logp(-1));
		System.out.println(Math.log1p(-1.1));
		System.out.println(Math.IEEEremainder(92,0));
		System.out.println(Math.abs(-1.0/0));
		System.out.println(Math.abs(0.0/0));
		System.out.println((int)Math.toDegrees(3.14));
		System.out.println((int)Math.toRadians(57.3));
		
		System.out.println((int)Math.abs(5.25));
		System.out.println(2+(int)(Math.random()*((10-2))));
		System.out.println((int)Math.random());
		String dd=String.valueOf(new char[]{'a','c'});
		System.out.println("peter".compareToIgnoreCase("peter"));
		System.out.println("University".replace("i","ABC"));
		String ddd[]= "Welcome to Java".split("o");	
		System.out.print("A,B;C".replaceAll(",;","#")+" ");
		System.out.println("A,B;C".replaceAll("[,;]","#"));
		char[] xs=new char[]{'a','a'};
		double[] list={3.4,2.0,3.5,5.5};


	
	
	}
}
