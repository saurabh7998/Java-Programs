package hashing.problems;

//Naive Approach
public class FrequenciesOfElements {

	public static void main(String[] args) {

		int[] arr1 = { 10, 10, 20, 30, 30, 20 };
		int[] arr2 = { 2, 2, 1, 3, 3, 2 }; 
		
		getFrequency(arr1);
		System.out.println("");
		getFrequency(arr2);

	}

	public static void getFrequency(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}

			if (flag == true) {
				continue;
			}

			int freq = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					freq++;
				}
			}

			System.out.print(arr[i] + ":" + freq + " ");
		}

	}

}
