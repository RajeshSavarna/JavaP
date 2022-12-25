package handson;

public class SecondLargestInList {

	public static void main(String[] args) {
		int[] arr = {1,4,86,43,3,41,78};
		
		int largest = 0;
		int secondlargest = 0;
		
		for (int i=0; i<arr.length; i++) { // 6
			if (largest < arr[i]) {
				secondlargest = largest;  // 4
				largest = arr[i]; // 4
			} else if (secondlargest < arr[i]) {
				secondlargest = arr[i];
			}
			
		}
		
		System.out.println(secondlargest);
	}

}
