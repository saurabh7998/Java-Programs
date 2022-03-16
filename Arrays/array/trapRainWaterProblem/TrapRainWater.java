package array.trapRainWaterProblem;

public class TrapRainWater {
	
	public static void main(String[] args) {
		
		int[] arr = {3,0,1,2,5};
		System.out.println(findMaxVolume(arr));
	}
	
	public static int findMaxVolume(int[] arr) {
		int result = 0;
		int n = arr.length;
		for(int i=1; i<n-1; i++) /*because corner bars cannot store anything*/ {
			int lmax = arr[i];
			
			for(int j=0; j<i; j++) {
				lmax = Math.max(lmax, arr[j]);
			}
			
			int rmax = arr[i];
			
			for(int j=i+1; j<n; j++) {
				rmax = Math.max(rmax, arr[j]);
			}
			
			result += (Math.min(lmax, rmax) - arr[i]);
		}
		return result;
	}
	
	

}
