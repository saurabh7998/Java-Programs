package recursion.commonQuestions;


// non tail recursive implementation
public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(getFact(5));
		
	
	}
	
	
	public static int getFact(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		
		
		return n*getFact(n-1);
	}

}
