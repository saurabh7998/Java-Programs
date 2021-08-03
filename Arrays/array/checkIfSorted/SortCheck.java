package array.checkIfSorted;

public class SortCheck {
	
	public static boolean isSorted(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		int[] arr1 = {3,5,6,2,4};
		
		System.out.println(isSorted(arr));
		System.out.println(isSorted(arr1));
	}
}
