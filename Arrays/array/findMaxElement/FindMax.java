package array.findMaxElement;

public class FindMax {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 32, 1, 66, 40 };
		System.out.println(getMaxElement(arr));

	}

	public static int getMaxElement(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean flag = true;

			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[i]) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				return i;
		}
		return -1;
	}
}
