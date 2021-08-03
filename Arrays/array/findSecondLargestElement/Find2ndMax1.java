package array.findSecondLargestElement;

public class Find2ndMax1 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 32, 1, 66, 40, 33, 65 };
		System.out.println(getSecondLargestItem(arr));
	}

	public static int getSecondLargestItem(int[] arr) {

		int res = -1;
		int largest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			}

			else if (arr[i] < arr[largest]) {
				if (res == -1 || arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		return res;

	}

}
