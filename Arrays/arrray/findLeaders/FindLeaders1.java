package arrray.findLeaders;

public class FindLeaders1 {

	public static void findLeaders(int[] arr) {
		int n = arr.length;
		int currLeader = arr[n - 1];
		System.out.println(currLeader);

		for (int i = n - 2; i >= 0; i--) {
			if (currLeader<arr[i]) {
				currLeader = arr[i];
				System.out.println(currLeader);
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 7, 10, 4, 10, 6, 5, 2 };

		findLeaders(arr);
	}

}
