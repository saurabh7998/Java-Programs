package recursion.ropeCuttingProblem;

/*
 * Given a rope of length n, and which can only be cut into pieces of sizes a, b, c. Find the maximum number of pieces after making the cuts.
 * Eg:
 * n = 5, a=1, b=5, c=3
 * Therefore n can be cut in 5 pieces of size 1 or 1 piece of size 5.
 * Here the answer is 5 because we consider the maximum number of pieces 
 */
public class RopeCutting {
	
	public static void main(String[] args) {
		
		System.out.println(function(5, 1, 3, 5)); //o/p = 5
		
		System.out.println(function(23, 11, 12, 9));  // 11+12 = 23, therefore o/p = 2
		
		
	}
	
	public static int function(int n, int a, int b, int c) {
		
		if(n==0)
			return 0;
		
		if(n<0)
			return -1;
		
		int res = Math.max(function(n-a, a, b, c), function(n-b, a, b, c));
		int result = Math.max(res, function(n-c, a, b, c));
		
		if(result==-1)
			return -1;
		
		return result+1;
		
	}
	
	

}
