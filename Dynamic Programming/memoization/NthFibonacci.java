package memoization;

public class NthFibonacci {
	
	static int[] memo;
	
	public static void main(String[] args) {
		
		int n = 7;
		memo = new int[n+1];
		for(int i=0; i<n+1; i++) {
			memo[i] = -1;
		}
		
		System.out.println(fib(n));
	}
	
	public static int fib(int n) {
		int res = 0;
		if(memo[n]==-1) {
			
			if(n==0 || n==1) {
				res = n;
			}else {
				res= fib(n-1) + fib(n-2);
			}
			memo[n] = res;
		}
		return memo[n];
		
	}

}
