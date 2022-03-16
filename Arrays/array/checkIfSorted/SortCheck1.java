package array.checkIfSorted;

public class SortCheck1 {

	public static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6 };
		int[] arr1 = { 3, 5, 6, 2, 4 };

		System.out.println(isSorted(arr));
		System.out.println(isSorted(arr1));
	}

}
