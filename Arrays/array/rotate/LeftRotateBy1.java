package array.rotate;

public class LeftRotateBy1 {

	public static void rotate(int[] arr) {

		int temp = 0;
		temp = arr[0];

		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}

		arr[arr.length - 1] = temp;

		
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		rotate(arr);
		
		System.out.println("Rotated array by 1 is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}
}
