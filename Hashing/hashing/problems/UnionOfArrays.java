package hashing.problems;

import java.util.HashSet;

public class UnionOfArrays {

	public static void main(String[] args) {

		int[] arr1 = { 10, 15, 20, 15, 30, 30, 5 };
		int[] arr2 = { 30, 5, 30, 80 };
		

		System.out.println(union(arr1, arr2));
	}

	public static int union(int[] arr1, int[] arr2) {

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			hs.add(arr2[i]);
		}

		return hs.size();

	}

}
