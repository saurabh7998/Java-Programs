package mathematics.factorial;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(calculateFactorial(5));
	}
	
	
	public static int calculateFactorial(int n) {
		
		int fact = 1;
		for(int i=2; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}

}
