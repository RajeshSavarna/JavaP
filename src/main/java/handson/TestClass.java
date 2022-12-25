package handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		
		int[] arr11 = {1,3,5,9,12,22,45,32,22,38};
		int n = 22;

		boolean flag = false;
		for (int i=0; i<arr11.length; i++) {
			if (arr11[i] == n) {
				flag = true;
				break;
			}
		}

		List<Integer> list11 = Arrays.stream(arr11)
			      .boxed()
			      .collect(Collectors.toList());

		String result = list11.stream()
			      .map(n1 -> String.valueOf(n1))
			      .collect(Collectors.joining("-", "{", "}"));
//		System.out.println(result);
		
		list11.stream().filter(a -> a.equals(n)).collect(Collectors.toList());
		list11.stream().filter(a -> a.equals(n)).findAny().get();

		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] arrB = {4,5,6,7,8};

		List<List<Integer>> list = new ArrayList<>();

		List<Integer> l1 = Arrays.stream(arr)
			      .boxed()
			      .collect(Collectors.toList());
		list.add(l1);
		List<Integer> l2 = Arrays.stream(arrB)
			      .boxed()
			      .collect(Collectors.toList());
		list.add(l2);
		
		list.stream().flatMap(a -> a.stream()).filter(a -> l1.contains(a) && l2.contains(a)).distinct().forEach(System.out::println);
		
		
		l1.retainAll(l2);
		System.out.println(l1.toString());
		
		
		List<Integer> listttt = Arrays.asList(0,1,5,2,4,3,6);

		System.out.println("Normal Sort " +listttt.stream().sorted().skip(1).findFirst().get());// == 1

		System.out.println("Reverse Sort " +listttt.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get()); //== 5

		List<Integer> liste = Arrays.asList(01,10,001,010,100,1,0);
		liste.forEach(a -> System.out.println(a + " = " + Integer.toBinaryString(a) + " = " + convertIntegerToBinary(a)));
//		liste.stream().map(a -> ""+a).filter(a -> a.charAt(0) == '0').forEach(System.out::println);
		
		
	}

	public static String convertIntegerToBinary(int n) {
	    if (n == 0) {
	        return "0";
	    }
	    StringBuilder binaryNumber = new StringBuilder();
	    while (n > 0) {
	        int remainder = n % 2;
	        binaryNumber.append(remainder);
	        n /= 2;
	    }
	    binaryNumber = binaryNumber.reverse();
	    return binaryNumber.toString();
	}
}
