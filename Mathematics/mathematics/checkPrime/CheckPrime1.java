package mathematics.checkPrime;

public class CheckPrime1 {
	public static void main(String[] args) {

		System.out.println(isPrime(10));
		System.out.println(isPrime(7));
	}

	public static boolean isPrime(int n) {

		if (n == 1)
			return false;

		for (int i = 2; i*i<=n; i++) { // or, for(int i=2; i<=Math.sqrt(n); i++)// 
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
