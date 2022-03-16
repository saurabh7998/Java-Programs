package strings.InterviewQuestions;

import java.util.Arrays;
/**
 * Check if string 1 is a permutation of string 2
 * @author saurabh
 *
 */
public class CheckPermutation {
	
	public static void main(String[] args) {
		String s1 = "dog";
		String s2 = "god";
		String s3 = "fog";
		
		System.out.println(checkPermutation(s1, s2));
		System.out.println(checkPermutation(s2, s3));
		System.out.println("");
		
		System.out.println(checkPermutation(s1, s2));
		System.out.println(checkPermutation(s2, s3));
	}
	
	/**
	 * Big O(n)
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean checkPermutation(String s1, String s2) {
		
		if(s1.length()!=s2.length())return false;
		
		//There are only 128 possible characters in a string
		int[] count = new int[128];
		
		char[] char_array = s1.toCharArray();
		for(char c:char_array) {
			count[c]++;
		}
		
		for(int i=0; i<s2.length(); i++) {
			char c =  s2.charAt(i);
			count[c]--;
			if(count[c]<0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkPermutation1(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return c1.equals(c2);
	}

}
