package programs;
class Patter1 {
	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i<=6 ; i++ ) {
			for (int j = 1; j<i ; j++ )
				System.out.print( i==j ? (count++) : (count++ +" "));
			System.out.println();
		}

		String str = "Mr. Ayurj Verma (Chutiya Nandan)";
		String str1[] = str.split("[Aea]");

		for (String s : str1 )
		{
			System.out.println(s);
		}
	}
}
