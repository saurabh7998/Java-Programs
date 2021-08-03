package searching.binarySearch;

public class RecursiveBinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};  //array is always sorted for binary search
		int low = 0;
		int high = arr.length-1;
		int x = 4;
		
		System.out.println(bSearch(arr,low,high,x)); // 4 is at index 3
		
		
	}
	
	
	public static int bSearch(int[] arr, int low, int high, int x) {
		
		if(low>high) {
			return -1;
		}
		
		int mid = (high+low)/2;
		
		if(arr[mid]==x) {
			return mid;
		}
		
		else if(arr[mid]>x) {
			return bSearch(arr, low, mid-1, x);
		}
		else {
			return bSearch(arr, mid+1, high, x);
		}
		
		
	}

}
