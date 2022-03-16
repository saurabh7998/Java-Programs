package mathematics.factorial;

public class TrailingZero {
	
	public static void main(String[] args) {
		System.out.println(getNumOfZeroes(10)); // has 2 trailing 0s
		System.out.println(getNumOfZeroes(5));  // has 1 trailing 0  (5! = 120)
	}
	
	
	public static int getNumOfZeroes(int n) {
		
		int count = 0;
		int fact = 1;
		
		for(int i=2; i<=n; i++) {
			fact = fact*i;
		}
		
		while(fact%10 == 0) {
			count++;
			fact = fact/10;
		}
		return count;
	}

}
