package array.maxConsecutive1;

public class CountMaxConsecutiveOnes1 {
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,1,1,0,1,1,1,1}; // 4 consecutive 1s
		System.out.println(getMaxCount(arr));
	}
	
	public static int getMaxCount(int[] arr) {
		
		int res = 0 , current = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				current = 0;
			}
			else {
				current++;
				res = Math.max(current, res);
			}
		}
		return res;
	}

}
