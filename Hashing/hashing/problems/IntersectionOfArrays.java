package hashing.problems;

import java.util.HashSet;

public class IntersectionOfArrays {
	
	public static void main(String[] args) {
		
		int[] arr1 = {10,15,20,15,30,30,5};
		int[] arr2 = {30,5,30,80};
		
		System.out.println(intersection(arr1, arr2)); // 30 and 5 are common elements. Therefore output should be 2 
														//although 30 appears multiple times in both arrays.
	}
	
	public static int intersection(int[] arr1, int[] arr2) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		int result = 0;
		
		for(int i=0; i<arr1.length; i++) {
			hs.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			if(hs.contains(arr2[i])) {
				result++;
				hs.remove(arr2[i]);
			}
		}
		return result;
	}

}
