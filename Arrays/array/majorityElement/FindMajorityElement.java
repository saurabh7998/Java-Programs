package array.majorityElement;

//This code returns the first 'index' of the majority element.
public class FindMajorityElement {
	
	public static int findMajorityElement(int[] arr) {
		
		int n = arr.length;
		int majorityCheck = n/2;
		
		
		for(int i=0; i<n; i++) {
			int count = 1;
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>majorityCheck)
				return i;
		}
		System.out.print("No majority");
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {8,3,4,8,8};
		System.out.println(findMajorityElement(arr)); // op: 0
		
		int[] arr1 = {3,7,4,7,7,5};
		System.out.println(findMajorityElement(arr1)); // No output
		
		int[] arr2 = {20,30,40,50,50,50,50}; //op: 3
		System.out.println(findMajorityElement(arr2));
	}

}
