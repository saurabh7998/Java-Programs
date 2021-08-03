package array.removeDuplicates;

//Remove duplicates from a sorted arrray and return array size
public class RemoveDuplicates {

	public static int removeDuplicates(int[] arr) {
		int result = 1;
		
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[result-1]) {
				arr[result] = arr[i];
				result++;
			}
			//result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,10,20,20,30,30,30}; // has 3 unique elements
		int[] arr1 = {10,20,30,40,50,50};  // has 5 unique elements
		
		System.out.println(removeDuplicates(arr));
//		for(int i=0; i<arr.length; i++)
//			System.out.print(arr[i]+",");
		System.out.println(removeDuplicates(arr1));
	}
	
}
