package handson;

public class MatrixTest {

	public static Boolean findWord(String word) {
	    // car(0,2), arc(1,2), cat(4,2), race (5,0)
	    String[][] input = {
	            {"a", "b", "c", "d", "e", "f"},
	            {"a", "b", "a", "r", "c", "f"},
	            {"a", "b", "r", "d", "e", "f"},
	            {"a", "b", "c", "d", "e", "f"},
	            {"a", "b", "c", "a", "t", "f"},
	            {"r", "a", "x", "e", "e", "f"}};
				
	    
		for (int i=0; i<input.length; i++) {
			int index = 0;
			for (int j=0; j<input[i].length; j++) {
				if (input[i][j].equals(word.charAt(index)+"")) {
					
					for (int k=j; k<j + word.length() && k<input[i].length; k++) {
						if (input[i][k].equals(word.charAt(index)+"")) {
							index++;
						}
						if (index == word.length()-1) {
							return true;
						}
					}
				}
			}	

			
			index = 0;
			
			for (int j=0; j<input[i].length; j++) {
				
				if (input[j][i].equals(word.charAt(index)+"")) {

					System.out.println(input[j][i]);
					for (int k=j; k<j + word.length() && k<input.length; k++) {
						if (input[j][k].equals(word.charAt(index)+"")) {
							index++;
						}
						if (index == word.length()-1) {
							return true;
						}
					}
				}
			}
		}
	    return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findWord("xee"));
	}

}
