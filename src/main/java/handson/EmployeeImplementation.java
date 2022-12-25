package handson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class EmployeeImplementation {

	private static final Logger log = Logger.getLogger(EmployeeImplementation.class.getName());
	public static void main(String[] args) {
		
		Employee p1 = new Employee(1, "Rajesh", 10l);

		Map<Employee, String> hm = new HashMap<>();
		hm.put(p1, "Hello");

		p1.setName("Ajay");
		
		System.out.println("================" + hm);
		
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Rajesh", 10l));
		list.add(new Employee(2, "Rohan", 20l));
		list.add(new Employee(3, "Rohit", 30l));
		list.add(new Employee(1, "Rajesh", 10l));
		
		list.stream().collect(Collectors.toSet()).stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		
		
		int ia = 567231;
		
		int evenNumber = 0;
		int evenNumberSum = 0;
		int oddNumber = 0;
		int oddNumberSum = 0;

		int temp = ia; // 567231 //56723 == 5 + 7+ 
		while (temp > 0 ) {
			int num = temp % 10;
			if (num % 2 == 0) {
				evenNumber++;
				evenNumberSum += num;
			} else {
				oddNumber++;
				oddNumberSum += num;
			}
			temp = temp/10;
		}
		
		System.out.println("OddNumber :" + oddNumber + ", OddNumberSum : " + oddNumberSum + ", evennumber : " + evenNumber + ", evennumbersum : " + evenNumberSum);
	
		String str1 = "Today is Tuesday";

		Map<Character, Integer> map = new HashMap<>();

		for (int i=0; i<str1.length(); i++) {
			if (null == map.get(str1.charAt(i))) {
				map.put(str1.charAt(i), 1);
			} else {
				map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
			}
		}

		System.out.println(map);


		Map<Character, Long> map1 = str1.chars().mapToObj(a -> (char)a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		log.info(map1.toString());
	}

}
