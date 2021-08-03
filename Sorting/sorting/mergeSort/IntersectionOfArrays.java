package sorting.mergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays {

	public static void main(String[] args) {

		int[] a = { 20, 10, 20, 60, 40 };
		int[] b = { 20, 2, 60, 20 };

		findIntersection(a, b);
	}

	public static void findIntersection(int[] a, int[] b) {

		// Sort the arrays first, because the merge function technique of merge sort
		// only works on sorted arrays
		Arrays.sort(a);
		Arrays.sort(b);

		int m = a.length;
		int n = b.length;
		//10,20,20,60,40
		//2,20,20,60
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (i > 0 && a[i] == a[i - 1]) {
				i++;
				continue;
			}

			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				j++;
			} else {
				System.out.println(a[i]);
				i++;
				j++;
			}
		}
	}

}
