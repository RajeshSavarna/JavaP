class PatternSingleLoop {
	static int num = 1;
	public static void main(String...args) {
		int digit = 0;
		for (int i = 1 ; i<=5 ; ) {
			if (digit < i) {
				System.out.print(num++ +" ");
				digit++;
				continue;
			}
			else {
				System.out.println("\n");
				i++;
				digit = 0;
			}
			/*
			if (digit == i) {
				System.out.println("\n");
				i++;
				digit = 0;
			}
			*/
		}
	}
}
