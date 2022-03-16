package searching.binarySearch.Problems;

public class CountOccurences {

	public static void main(String[] args) {
		
		int[] arr = {10,10,10,20,20,20,30,30}; 
		int x = 20;
		int y = 30;
		
		System.out.println(countOccurences(arr, x)); // There are 3 occurrences of 20
		System.out.println(countOccurences(arr, y)); // There are 2 occurrences of 30


	}

	public static int findFirstOccurence(int[] arr, int x) {

		int low = 0;
		int high = arr.length - 1;
		int mid = 0;

		while (low <= high) {

			mid = (high + low) / 2;

			if (arr[mid] > x) {
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				if (mid == 0 || arr[mid] != arr[mid - 1]) {
					return mid;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

	public static int findLastOccurence(int[] arr, int x) {

		int low = 0;
		int high = arr.length - 1;
		int mid = 0;

		while (low <= high) {

			mid = (high + low) / 2;

			if (arr[mid] > x) {
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
					return mid;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}

	public static int countOccurences(int[] arr, int x) {
		
		int first = findFirstOccurence(arr, x);
		
		if(first==-1) {
			return 0;
		}
		
		int last = findLastOccurence(arr, x);
		
		return (last-first)+1;

	}

}
