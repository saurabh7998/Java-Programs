package mathematics.factorial;

public class Factorial1 {
	
	public static void main(String[] args) {
		System.out.println(getFact(4));
	}
	
	public static int getFact(int n) {
		
		if(n==0) {
			return 1;
		}
		
		return n*getFact(n-1);
	}

}
