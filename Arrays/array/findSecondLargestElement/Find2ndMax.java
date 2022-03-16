package array.findSecondLargestElement;

public class Find2ndMax {
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 32, 1, 66,40};
		System.out.println(getSecondLargestItem(arr));
	}
	
	
	public static int getSecondLargestItem(int[] arr) {
		int largest = getLargestItem(arr);
		int res = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=arr[largest]) {
				if(res==-1) {
					res = i;
				}
				else if(arr[i]>arr[res]) {
					res = i;
				}
			}
		}
		return res;
		
	}
	
	public static int getLargestItem(int[] arr) {
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
