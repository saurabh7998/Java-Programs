package memoization;
/**
 * This code does not use memoization
 * This code is a general recursion based solution.
 * @author saurabh
 *
 */
public class LargestCommonSubSequence {
	
	static int[][]memo;
	
	public static void main(String[] args) {
		
		String s1 = "AXYZ";
		String s2 = "BAZ";
		
		
		int m1 = s1.length();
		int m2 = s2.length();
		
		int a = lca(s1, s2, m1, m2);
		System.out.println(a);
		
	}
	
	public static int lca(String s1, String s2, int m1, int m2) {
		
		if(m1==0 || m2==0) {
			return 0;
		}
		if(s1.charAt(m1-1)==s2.charAt(m2-1)) {
			return 1 + lca(s1,s2,m1-1,m2-1);
		}
		
		return Math.max(lca(s1,s2,m1-1,m2), lca(s1,s2,m1,m2-1));
		
	}

}
