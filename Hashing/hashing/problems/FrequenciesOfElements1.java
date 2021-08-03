package hashing.problems;

import java.util.HashMap;
import java.util.Map;

//Efficient Approach
public class FrequenciesOfElements1 {
	
	public static void main(String[] args) {
		
		int[] arr1 = { 10, 10, 20, 30, 30, 20 };
		int[] arr2 = { 2, 2, 1, 3, 3, 2 }; 
		
		countFrequncies(arr1);
		
		
	}
	
	
	public static void countFrequncies(int[] arr) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int x : arr) {
			hm.put(x, hm.getOrDefault(x, 0)+1);
			
		}
		
		for(Map.Entry<Integer, Integer> itr: hm.entrySet())
	        System.out.println(itr.getKey() + " " + itr.getValue());
		
		
		
	}

}
