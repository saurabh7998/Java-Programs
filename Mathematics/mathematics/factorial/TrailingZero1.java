package mathematics.factorial;

public class TrailingZero1 {
	
	public static void main(String[] args) {
		System.out.println(getNumOfZeroes(10));
		System.out.println(getNumOfZeroes(5));
		System.out.println(getNumOfZeroes(100));
	}
	
	
	public static int getNumOfZeroes(int n) {
		
		int res = 0;
		for(int i=5; i<=n; i=i*5) {
			res = res + n/i;
		}
		return res;
	}
}
