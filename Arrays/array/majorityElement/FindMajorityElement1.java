package array.majorityElement;

//This code returns any of the 'index' of the majority element.
public class FindMajorityElement1 {
	
	public static void main(String[] args) {
		
		int[] arr = {8,3,4,8,8};
		System.out.println(findMajorityElement(arr)); // op: 0
		
		int[] arr1 = {3,7,4,7,7,5};
		System.out.println(findMajorityElement(arr1)); // No output
		
		int[] arr2 = {20,30,40,50,50,50,50}; //op: 3
		System.out.println(findMajorityElement(arr2));
		
	}
	
	
	public static int findMajorityElement(int[] arr) {
		
		//Find a majority candidate:
		int n = arr.length;
		int res = 0;
		int count = 1;
		for(int i=1; i<n; i++) {
			if(arr[res]==arr[i]) {
				count++; //to increase the votes of majority
			}else {
				count--; //to cancel out or nil out the votes, so that it does not show false majority
			}
			if(count==0) /*reset*/{
				res = i;
				count = 1;
			}
		}
		
		//To check if the candidate found is actually in the majority.
		//In order to be in majority, the element(candidate) has to occur more than n/2 times.
		
		count = 0;
		for(int i=0; i<n; i++) {
			if(arr[res]==arr[i]) {
				count++;
			}
		}
		if(count<=n/2) {
			res = -1;
		}
		return res;
	}

}
