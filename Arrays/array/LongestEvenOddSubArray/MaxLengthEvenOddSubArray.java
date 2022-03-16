package array.LongestEvenOddSubArray;

public class MaxLengthEvenOddSubArray {
	
	public static void main(String[] args) {
		int[] arr = {10,12,14,7,8};
		System.out.println(getMaxLength(arr));
		
		int[] arr1 = {7,10,13,14};
		System.out.println(getMaxLength(arr1));
		
		int[] arr2 = {10,12,8,4};
		System.out.println(getMaxLength(arr2));
		
	}
	
	
	public static int getMaxLength(int[] arr) {
		
		int count = 1;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]%2==0) {
				if(arr[i+1]%2!=0) {
					count++;
				}
			}
			
			if(arr[i]%2!=0) {
				if(arr[i+1]%2==0) {
					count++;
				}
			}
		}
		return count;
	}

}
