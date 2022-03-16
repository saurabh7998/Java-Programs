package array.maximumSumSubArray;

public class MaxSumSubArray {

	public static void main(String[] args) {

		int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
		System.out.println(getMaxSum(arr));

		int[] arr1 = { 1, -2, 3, -1, 2 };
		System.out.println(getMaxSum(arr1));
	}

	public static int getMaxSum(int[] arr) {
		// int maxSum = arr[0];
		int res = 0;
		int n = arr.length;
		int k = 0;
		for (int i = 0; i < n; i++) {
			int maxSum = arr[i];
			for (int j = i + 1; j < n ; j++) {
				maxSum += arr[j];
				res = Math.max(maxSum, res);
			}
			
		}
		return res;
	}

}
