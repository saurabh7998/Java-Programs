package recursion.commonQuestions;


// Tail recursive implementation
public class Factorial1 {
	
	public static void main(String[] args) {
		int k = 1;
		System.out.println(getFact(5, k));
		
	}
	
	public static int getFact(int n, int k) {
		
		if(n==0 || n==1)
			return k;
		
		return getFact(n-1, n*k);
	}

}
