package handson;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println(test(1));
		

		call(null);

	}

	private static int test(int i) {
		try {
			throw new NullPointerException();
		} catch (Exception ex) {
			return 3;
//			throw new NullPointerException();
		} finally {
			return 3;
		}
	}
	


	public static void  call(Object O){
	      System.out.println("obj....");
	  }

	  public static void  call(NullPointerException O){
	    System.out.println("NullPointerException...");
	  }
	  
	  public static void  call(Throwable O){
	    System.out.println("Throwable.....");
	  }

	  public static void  call(Exception O){
	    System.out.println("Exception......");
	  }

}
