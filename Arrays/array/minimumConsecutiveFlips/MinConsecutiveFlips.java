package array.minimumConsecutiveFlips;

public class MinConsecutiveFlips {
	
	// Find minimum number of flips to be made to make the entire array same (either all 0s or all 1s)
	
	public static void main(String[] args) {
		int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0}; //Flip from index 2 to 3 and 6 to 7

	    findMinFlips(arr);
		
	    System.out.println("");
	    int arr1[] = {0, 0, 1, 1, 0, 0, 1, 1, 1}; // Here arr[n-1]!=arr[0]...thus the last 'if' condition handles it.
	    findMinFlips(arr1);
	}
	
	public static void findMinFlips(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				if(arr[i]!=arr[0]) {
					System.out.print("From " + i + "  to ");
				}
				else {
					System.out.println(i-1);
				}
			}
		}
		int n = arr.length;
		
		
		
		//last 'if' condition
		if(arr[n-1]!=arr[0]) {
			System.out.println(n-1);
		}
		
	}

}
