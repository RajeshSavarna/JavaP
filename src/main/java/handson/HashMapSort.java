package handson;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 5);
		map.put("U", 7);
		map.put("i", 2);
		
		map.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue))
		.forEach(a -> System.out.println(a.getKey() +" == "+ a.getValue()));
	}

}
