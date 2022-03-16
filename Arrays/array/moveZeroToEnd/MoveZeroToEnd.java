package array.moveZeroToEnd;

// Work on this later.
/*Code NOT WORKING!!!*/

public class MoveZeroToEnd {
	
	public static void main(String[] args) {
		int[] arr = {10,0,3,0,9,0,1};
		moveZeroToEnd(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	public static void moveZeroToEnd(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				for(int j=i+1; j<arr.length; j++) {
					swap(i,arr, arr[i], arr[i+1]);
				}
			}
		}
	}
	
	public static void swap(int i,int[] arr, int a, int b) {
		int temp=0;
		temp =a;
		a = b;
		b = temp;
		
		arr[i]=a;
		arr[i+1]=b;
	}
}
