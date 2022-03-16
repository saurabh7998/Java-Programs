package hashing.problems;

import java.util.HashSet;

public class SubarrayWithZeroSum {
	
	public static void main(String[] args) {
		int[] arr = {10,20,13,-3,-10, 4};
		
		System.out.println(isSubArrayPresent(arr));
	}
	
	public static boolean isSubArrayPresent(int[] arr) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		int prefix_sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			prefix_sum+=arr[i];
			
			if(hs.contains(prefix_sum)) {
				return true;
			}
			if(prefix_sum==0) {
				return true;
			}
			
			hs.add(prefix_sum);
		}
		return false;
		
	}

}
