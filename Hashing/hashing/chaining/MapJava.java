package hashing.chaining;

import java.util.*;
import java.util.Map.Entry;


public class MapJava {
	
	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();
		// Every 'Entry' in a map is represented as <K,V>
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("five", 5);
		
		System.out.println(numbers);
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
		
		numbers.putIfAbsent("one", 10);
		numbers.putIfAbsent("six", 6);
		System.out.println(numbers);
		
		for(Entry<String, Integer> entry : numbers.entrySet()) {
			entry.setValue(entry.getValue()*100);
		}
		System.out.println(numbers);
		
	}
}
