package recursion.commonQuestions;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println(countDigits(123, sum));  // 1+2+3 = 6
		System.out.println(countDigits(9987, sum));// 9+9+8+7 = 33
		System.out.println(countDigits(10, sum)); // 1+0 = 1

	}

	public static int countDigits(int n, int sum) {

		sum += n % 10;

		if (n != 0) {
			n = n / 10;
		} else if (n == 0) {
			return sum;
		}
		return countDigits(n, sum);
	}

}
