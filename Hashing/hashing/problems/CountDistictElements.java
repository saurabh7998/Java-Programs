package hashing.problems;

//Naive Approach
public class CountDistictElements {
	
	public static void main(String[] args) {
		
		int[] arr1 = {10,10,20,30,30,20};  // It has 3 distinct elements
		int[] arr2 = {2,2,2}; //It has 1 distinct element
		
		System.out.println(getCount(arr1));
		System.out.println(getCount(arr2));
		
		
	}
	
	public static int getCount(int[] arr) {
		
		
		int res=0;
		
		for(int i=0; i<arr.length; i++) {
			boolean flag=true;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					flag=false;
					break;
				}
			}
			
			if(flag==true) {
				res+=1;
			}
		}
		
		return res;
	}
	

}
