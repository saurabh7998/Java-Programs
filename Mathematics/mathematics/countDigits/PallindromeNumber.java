package mathematics.countDigits;

public class PallindromeNumber {
	
	public static void main(String[] args) {
		System.out.println(isPallindrome(313));
		
	}
	
	public static boolean isPallindrome(int n) {
		
		int temp = n;
		int rev = 0;
		
		while(temp!=0) {
			rev = (rev*10) + (temp%10);
			temp = temp/10;
		}
		
		
		return rev==n;
	}

}

// Time Complexity: Theta(no. of digits)
