package searching.binarySearch.Problems;

public class TwoPointerApproach {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 12, 30 };
		int x = 17;
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		findPair(arr, x, left, right); //5+12 = 17
	}

	public static int findPair(int[] arr, int x, int left, int right) {

		while (left < right) {

			if (arr[left] + arr[right] == x) {
				System.out.println("Pair is: "+arr[left] + "," + arr[right]);
				return 1;
			}

			else if (arr[left] + arr[right] > x) {
				right--;
			}
				
			else {
				left++;
			}
		}
		
		return -1;
	}

}
