package hashing.problems;

import java.util.Arrays;
import java.util.HashSet;


public class CountDistinctElements1 {

	public static void main(String[] args) {

		int[] arr1 = { 10, 10, 20, 30, 30, 20 }; // It has 3 distinct elements
		int[] arr2 = { 2, 2, 2 }; // It has 1 distinct element

		System.out.println(getCount(arr1));
		System.out.println(getCount(arr2));

	}
	
	//Efficient function using HashMaps Theta(n) Time
	public static int getCount(int[] arr) {

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}

		return hs.size();

	}
	
//	public static int getCount1(int[] arr) {
//		
//		HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
//		return hs.size();
//	}

}
