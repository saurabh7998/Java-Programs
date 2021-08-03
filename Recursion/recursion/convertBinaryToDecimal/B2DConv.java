package recursion.convertBinaryToDecimal;

public class B2DConv {
	
	public static void main(String[] args) {
		
		B2D(13);  // output should be 1101
		System.out.println("");
		B2D(7);   // output should be 111
	}
	
	
	public static void B2D(int n) {
		
		if(n==0) {
			return;
		}
		
		B2D(n/2);
		System.out.print(n%2);
	}

}
