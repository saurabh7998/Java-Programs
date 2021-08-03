package array.maximumSumSubArray;

public class MaxSumSubArray1 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
		System.out.println(getMaxSum(arr));

		int[] arr1 = { 1, -2, 3, -1, 2 };
		System.out.println(getMaxSum(arr1));

	}

	public static int getMaxSum(int[] arr) {

		int res = arr[0];
		int maxEnding = arr[0];

		for (int i = 0; i < arr.length; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);
			res = Math.max(maxEnding, res);
			
		}
		return res;
	}

}
