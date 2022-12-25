package handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStudent {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(0, "Rajesh", Arrays.asList("Math","Chemistry"))); //1
		list.add(new Student(1, "Raj", Arrays.asList("Physics","Science")));
		list.add(new Student(2, "Rohit", Arrays.asList("Chemistry","Science"))); //2
		list.add(new Student(3, "Rohit", Arrays.asList("Computer","Science")));
		
		List<Student> filteredList = list.stream().filter(a -> a.getSub().contains("Chemistry")).collect(Collectors.toList());
		
		Map<Integer, Student> map = new HashMap<>();
		list.stream().forEach(a -> map.put(a.getId(), a));
		list.stream().collect(Collectors.toMap(a -> a.getId(), a -> a));
	}
}
