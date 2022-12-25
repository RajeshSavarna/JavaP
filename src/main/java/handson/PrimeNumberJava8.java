package handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeNumberJava8 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,4,5,6,7,8,9,10,11);
		
		int sum = list.get(list.size() - 1) * (list.get(list.size() - 1) + 1) / 2;
		List<Integer> list1 = Arrays.asList(0);
		
		
		list.stream().forEach(a -> list1.set(0, list1.get(0) + a));
		if (list1.get(0) != sum) {
//			System.out.println(sum - list1.get(0));
		}
		
		List<String> list11 = Arrays.asList("Singapore", "India", "Norway", "Argentina", "Kenya");
		list11.stream().filter(a -> a.length() == 5).forEach(System.out::println);
		

		list.stream().filter( a -> isPrime(a)).forEach(System.out::println);
		

		List<List<Integer>> list1111 = new ArrayList<>(); 
		list1111.add(list);
		list1111.add(list);
		List<Integer> l= list1111.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
		System.out.println(l);

		
	}
	
	// method needs to be modified
	public static boolean isPrime(int data) {
		boolean flag = true;
		for (int i = 2; i < data; i++) {
			if (data % i == 0) {
				flag = false;
			}
		}
		return flag;
	}

}
		
		

