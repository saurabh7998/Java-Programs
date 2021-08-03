package sorting.mergeSort;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MergeSort {
	public static void main(String[] args) {
		int a[] = new int[] { 10, 15, 20, 40, 8, 11, 15, 22, 25 };
		int l = 0, r = 8;

		mergeSort(a, l, r);
		for (int x : a)
			System.out.print(x + " ");

	}

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	static void merge(int arr[], int l, int m, int h) {

		int n1 = m - l + 1, n2 = h - m;

		/* create temp arrays */

		int[] left = new int[n1];
		int[] right = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; i++)
			left[i] = arr[i + l];
		for (int j = 0; j < n2; j++)
			right[j] = arr[m + 1 + j];

		int i = 0; // Initial index of first subarray
		int j = 0; // Initial index of second subarray
		int k = l; // Initial index of merged subarray
		while (i < n1 && j < n2) {
			if (left[i] <= right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}

		/*
		 * Copy the remaining elements of left[], if there are any
		 */
		while (i < n1)
			arr[k++] = left[i++];
		/*
		 * Copy the remaining elements of right[], if there are any
		 */
		while (j < n2)
			arr[k++] = right[j++];
	}

	/*
	 * l is for left index and r is right index of the sub-array of arr to be sorted
	 */
	static void mergeSort(int arr[], int l, int r) {
		if (r > l) {

			// Same as (l+r)/2, but avoids overflow for
			// large l and h
			int m = l + (r - l) / 2;

			// Sort first and second halves
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}
}
