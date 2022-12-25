package handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class HashMapImpl {

	private static final Logger log = Logger.getLogger(HashMapImpl.class.getName());
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.addAll(Arrays.asList(2,3,4,5,6,7,8,9));
		
		Map<Integer, Boolean> hashMap = arr.stream().collect(Collectors.toMap(a -> a, a -> a%2 == 0));
		
		log.info(hashMap.toString());
	}

}
