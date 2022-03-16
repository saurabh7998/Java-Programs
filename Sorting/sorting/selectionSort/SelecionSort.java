package sorting.selectionSort;

import java.util.Arrays;

public class SelecionSort {

	public static void main(String[] args) {

		int[] arr = { 20, 5, 40, 60, 10, 30 };
		selectionSort(arr);

	}

	public static void selectionSort(int[] arr) {
		
		int min_index = 0;

		for (int i = 0; i < arr.length-1; i++) {
			min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					swap(arr, min_index, j);
					min_index = j;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}

		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}
