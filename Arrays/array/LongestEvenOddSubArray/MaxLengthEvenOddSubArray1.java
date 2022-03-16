package array.LongestEvenOddSubArray;

public class MaxLengthEvenOddSubArray1 {
	
	public static int getMaxLength(int[] arr) {
		
		int current = 1 , res = 1;
		
		for(int i=1; i<arr.length; i++) {
			if((arr[i]%2==0 &&arr[i-1]%2!=0) || (arr[i]%2!=0 &&arr[i-1]%2==0)) {
				current++;
				res = Math.max(res, current);
			}
			else {
				current = 1;  //reset the value of current
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,12,14,7,8};
		System.out.println(getMaxLength(arr));
		
		int[] arr1 = {7,10,13,14};
		System.out.println(getMaxLength(arr1));
		
		int[] arr2 = {10,12,8,4};
		System.out.println(getMaxLength(arr2));
		
	}

}
