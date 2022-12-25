package handson;

/**
2. Positive Prefixes

An array of integers, arr[n], can be rearranged arbitrarily.
The prefix sum at index i is defined as psum[i] = arr[0] + arr[1] + ... + arr[i].
Rearrange the array to maximize the number of positive elements in the psum array.
Report the maximum number of positive elements that can be achieved in the array psum.

Note: Here, a positive value is defined as an integer value greater than 0. 

Example n = 4 arr = [-6, 3, 4, -10] 
One optimal arrangement is [3, 4, -6, -10].

This has an array of prefix sums psum = [3, 7, 1, -9] with 3 positive elements. 
Return 3, the number of positive elements in psum. 
There is no way to have more than 3 positive elements. 

Function Description

Complete the function maxPosPrefixes in the editor. 
maxPosPrefixes has the following parameter: int arr[n]: an array of integers 
Returns int: the maximum possible number of positive elements 
Constraints1 ≤ n ≤ 105-109 ≤ arr[i] ≤ 109 

Input Format For Custom Testing
The first line contains an integer, n, the number of elements in arr.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, arr[i].

Sample Case 0
Sample Input For Custom Testing
STDIN FUNCTION----- --------4 → n = 4 -3 → arr = [-3, 0, 2, 1]021
Sample Output 3 
Explanation arr can be optimally rearranged to [2, 0, 1, -3].
psum = [2, 2, 3, 0] which has 3 positive elements. 

Sample Case 1
Sample Input For Custom Testing
STDIN FUNCTION----- --------3 → n = 3-3 → arr = [-3, 0, -2]0-2
Sample Output 0 
Explanation There is no arrangement of array arr to have a psum that is positive.
For example, consider arrangement of arr = [0, -2, -3]. 
The psum = [0, -2, -5] where all elements are non-positive
**/
import java.util.Arrays;
import java.util.List;



class Result {

    /*
     * Complete the 'maxPosPrefixes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int maxPosPrefixes(List<Integer> arr) {
		// Write your code here
		int res = 0;
		int sum = 0;
//		Collections.sort(arr);
//		for (int i=arr.size()-1; i>0; i--) {
//			sum += arr.get(i);
//			if (sum > 0) res++; 
//		}
		int temp = 0;
		for (int i=0; i<arr.size()-1; i++) {
			for (int j=i+1; j<arr.size(); j++) { 
				if (arr.get(i) < arr.get(j)) {
					temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
			sum += arr.get(i);
			if (sum > 0) res++; 
			else if (sum < 0) break;
		}
		return res;
	}
}

public class PositivePrefix {
    public static void main(String[] args) /*throws IOException*/ {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Arrays.asList(-6, 3, 4, -10, -8, -4, -7, -5);

        //for (int i = 0; i < arrCount; i++) {
        //    int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
        //    arr.add(arrItem);
        //}

        int result = Result.maxPosPrefixes(arr);
		System.out.print(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}
