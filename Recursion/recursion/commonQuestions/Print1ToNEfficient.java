package recursion.commonQuestions;

//This is a tail recursive implementation
public class Print1ToNEfficient {
	
	public static void main(String[] args) {
		
		int k = 1;
		print1ToN(5, 1);
		
	}
	
	public static void print1ToN(int n, int k) {
		
		if(n==0)
			return;
		
		System.out.print(k + " ");
		
		print1ToN(n-1, k+1);
	}

}
