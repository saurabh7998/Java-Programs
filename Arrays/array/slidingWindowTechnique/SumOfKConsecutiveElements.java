package array.slidingWindowTechnique;

public class SumOfKConsecutiveElements {
	
	public static void main(String[] args) {
		int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

	       System.out.println(getMaxSum(arr,k));
	}
	
	public static int getMaxSum(int[] arr, int k) {
		
		int curr_sum = 0;
		int max_sum = 0;
		for(int i=0; i<k; i++) {
			curr_sum += arr[i];
		}
		max_sum = curr_sum;
		
		for(int i=k; i<arr.length; i++) {
			curr_sum += (arr[i] - arr[i-k]);
			max_sum = Math.max(max_sum, curr_sum);
		}
		return max_sum;
	}

}
