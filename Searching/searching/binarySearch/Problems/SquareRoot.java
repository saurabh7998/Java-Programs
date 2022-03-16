package searching.binarySearch.Problems;

public class SquareRoot {
	
	public static void main(String[] args) {
		
		int x = 16;
		int y = 10;
		System.out.println(getSquareRoot(x));
		System.out.println(getSquareRoot(y));

		
		
	}
	
	
	public static int getSquareRoot(int x) {
		
		int low = 1;
		int high = x;
		int ans = -1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			
			int msq = mid*mid;
			
			if(msq==x)
				return mid; 
			else if(msq>x)
				high = mid-1;
			else
				low = mid+1;
				ans = mid-1;
			
		}
		return ans;
	}

}
