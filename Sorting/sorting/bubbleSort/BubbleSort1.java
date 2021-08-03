package sorting.bubbleSort;

import java.util.Arrays;

public class BubbleSort1 {
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,7,1,3,2,9,8};
		bubbleSort(arr);
	}
	
	
	
	public static void bubbleSort(int[] arr) {
		
		int n = arr.length;
		boolean swapped = false;
		
		for(int i=0; i<n-1; i++) {
			
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
					swapped = true;
				}
			}
			
			if(swapped==false) {
				break;
			}
		}
		
		System.out.println("Sorted array is: " + Arrays.toString(arr));
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
