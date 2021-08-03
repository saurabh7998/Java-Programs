package searching.binarySearch.Problems;

public class IndexOfLastOccurrence {
	
	public static void main(String[] args) {
		
		int[] arr = {10,10,10,20,20,20,30,30}; 
		int x = 20;
		int y = 10;
		
		System.out.println(findLastOccurence(arr, x)); // last occurrence of 20 is at index 5
		System.out.println(findLastOccurence(arr, y)); // last occurrence of 10 is at index 2
	}
	
	
	public static int findLastOccurence(int[] arr, int x) {
		
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		
		while(low<=high) {
			
			mid = (high+low)/2;
			
			if(arr[mid]>x) {
				high = mid-1;
			}
			else if(arr[mid]<x) {
				low = mid+1;
			}
			else {
				if(mid==arr.length-1 || arr[mid]!=arr[mid+1]) {
					return mid;
				}else {
					low = mid+1;
				}
			}
		}
		return -1;
	}

}
