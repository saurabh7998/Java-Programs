package array.frequenciesInSortedArray;

public class GetFrequencyOfElements {
		
	public static void getFrequency(int[] arr) {
		
		int frequency = 1;
		int n = arr.length;
		
		for(int i=1; i<arr.length; i++) {
			
			while(i<arr.length && arr[i]==arr[i-1]) {
				frequency++;
				i++;
			}
			System.out.println(arr[i-1] + ": " + frequency);
			frequency = 1;
		}
		
		if(n==1 || arr[n-1]!=arr[n-2]) {
			System.out.println(arr[n-1] + ": 1");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,10,10,25,25,30};
		getFrequency(arr);
		
		int[] arr1 = {10};
		getFrequency(arr1);
	}
}
