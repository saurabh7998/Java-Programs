package recursion.commonQuestions;

public class PrintNto1 {
	
	public static void main(String[] args) {
		printNto1(5);
	}
	
	
	public static void printNto1(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNto1(n-1);
	}

}
