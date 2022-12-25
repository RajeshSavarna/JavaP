package handson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test11111 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,5,6,2,3,5,4);
		
		System.out.println("Duplicate with HashMap: ");
		list.stream()
			.collect(Collectors.groupingBy(a -> a, Collectors.counting()))
			.entrySet().stream()
			.filter(a-> a.getValue() > 1)
			.forEach(a -> System.out.println(a.getKey()));
		
		System.out.println("Duplicate with HashSet: ");
		Set<Integer> set = new HashSet<>();
		list.stream()
			.filter(a -> false == set.add(a))
			.forEach(System.out::println);
		
		System.out.println("Max Number: " + list.stream().max(Comparator.comparingInt(a-> a)).get());
		
		
		System.out.println("2nd Max Number: " + list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		
		List<Integer> list11 = list.stream()
								.sorted()
								.collect(Collectors.toList());
		
		System.out.print("Max Number: "+list11.get(list11.size() - 1));

		list.stream().filter(a -> (a > 5 && a < 10)).forEach(System.out::println);
		
		List<Integer> sum = Arrays.asList(0);
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		list1.stream().sorted(Comparator.reverseOrder()).skip(1).forEach(a -> sum.set(0, sum.get(0) + a));		
		System.out.println("Sum1 = " + sum.get(0));
		
		System.out.println("Sum2 = " + list1.stream().filter(a -> a != 5).mapToInt(a -> a.intValue()).sum());
		
		System.out.println("Sum3 = " + list1.stream().filter(a -> a != 5).reduce(10, (a,b) -> Integer.sum(a, b)));

		System.out.println("Sum4 = " + list1.stream().collect(Collectors.summingInt(a -> a.intValue())));
		

		String str = "A big black bug bit big black dog on his bit black nose";
		
		String[] strgf = str.split(" ");
		
		List<String> i = Arrays.asList(strgf);
		Map<String, Long> m = i.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(m);
		
	}

}
