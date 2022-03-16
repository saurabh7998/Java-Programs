package mathematics.countDigits;

public class CountDigits {
	
	public static void main(String[] args) {
		System.out.println(countDigits(12345678));
	}
	
	public static int countDigits(int n) {
		
		int count = 0;
		
		while(n!=0) {
			n = n/10;
			count++;
		}
		return count;
	}

}
