package array.findMaxElement;

public class FindMax1 {
	
	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 32, 1, 66,40};
		System.out.println(getMaxElement(arr));
	}
	
	
	public static int getMaxElement(int[] arr) {
		int n = arr.length;
		int idx = 0;
		for(int i=0; i<n; i++) {
			if(arr[i]>arr[idx]) {
				idx = i;
			}
		}
		return idx;
	}

}
