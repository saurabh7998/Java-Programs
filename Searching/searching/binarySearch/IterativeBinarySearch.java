package searching.binarySearch;

public class IterativeBinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};  //array is always sorted for binary search
		int x = 7;
		//int x = 10; // O/P: -1
		
		System.out.println(bSearch(arr, x)); // 4 is at index 3
		
	}
	
	public static int bSearch(int[] arr, int x) {
		
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		
		while(low<=high) {
			
			mid = (low+high)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]>x) {
				high = mid-1;
			}
			else if(arr[mid]<x) {
				low = mid+1;
			}
				
		}
		return -1;
		
	}

}

//Time complexity: Big O(log n)
