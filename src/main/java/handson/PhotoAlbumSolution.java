package handson;
/**

1. Photo Album
There is a collection of photos to place into an empty photo album, one at a time by order of importance. Each time a photo is inserted, all subsequent photos are shifted toward the right by one position. Given the id's of the photos and the positions where each should be placed, find out the sequence of the photos in the album after all photos have been inserted.

 

Example

n = 5

index = [0, 1, 2, 1, 2]

identity = [0, 1, 2, 3, 4]

 

The sequence of the photos is as follows:

The photos 0, 1 and 2 keep the same indexes 0, 1 and 2 respectively.
The photo 3 is inserted in index 1 and the subsequent photos 1 and 2 are shifted right by one position.
The photo 4 is inserted in position 2 and again the photos 1 and 2 are shifted right by one position.
Identity 	        Album
0			[0]
1			[0, 1]
2			[0, 1, 2]
3			[0, 3, 1, 2]
4			[0, 3, 4, 1, 2]
 

Function Description 

Complete the function photoAlbum in the editor below.

 

photoAlbum has the following parameter(s):

     int index[n]:  the insertion points for each photo
    int identity[n]:  the photograph id numbers

 

Function Description 

    int[n]:  the sequence of identity values after all are inserted
 

 

Constraints

1 ≤ n ≤ 2 × 105
0 ≤ index[i], identity[i]  < n    (0≤ i < n)
 

 

Input Format For Custom Testing
Sample Case 0
Sample Input 0

STDIN     Function 
-----     -------- 
3    →    index[] size n = 3
0    →    index[] = [ 0, 1, 1 ]
1
1
3    →    identity[] size n = 3 
0    →    identity[] = [ 0, 1, 2 ]
1
2
Sample Output 0

0
2
1
Explanation 0

n = 3

index = [0, 1, 1]

n = 3

identity = [0, 1, 2]

 

The output array goes through the following steps: [0] → [0, 1] → [0, 2, 1].

Sample Case 1
Sample Input 1

STDIN     Function
-----     --------
2    →    index[] size n = 2
0    →    index[] = [ 0, 0 ]
0     
2    →    identity[] size n = 2
0    →    identity[] = [ 0, 1 ]
1
Sample Output 1

1
0
Explanation 1

n = 2

index = [0, 0]

n = 2

identity = [0, 1]

 

The output array goes through the following steps: [0] → [1, 0].

Sample Case 2
Sample Input 2

STDIN     Function
-----     --------
3    →   index[] size n = 3
0    →   index[] = [ 0, 1, 0 ]
1
0
3    →   identity[] size n = 3
0    →   identity[] = [ 0, 1, 2 ]
1
2
Sample Output 2

2
0
1
Explanation 2

n = 3

index = [0, 1, 0]

n = 3

identity = [0, 1, 2]

 

The output array goes through the following steps: [0] → [0, 1] → [2, 0, 1].
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result1 {

    /*
     * Complete the 'photoAlbum' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY index
     *  2. INTEGER_ARRAY identity
     */

    public static List<Integer> photoAlbum(List<Integer> index, List<Integer> identity) {
    // Write your code here
        List<Integer> album = new ArrayList<>();
        for(int i =0;i<identity.size();i++){
            album.add(index.get(i),identity.get(i));
        }
        return album;
    }

}

public class PhotoAlbumSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int indexCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> index = IntStream.range(0, indexCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int identityCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> identity = IntStream.range(0, identityCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result1.photoAlbum(index, identity);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
