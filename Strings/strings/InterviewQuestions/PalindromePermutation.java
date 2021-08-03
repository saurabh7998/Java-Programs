package strings.InterviewQuestions;

/**
 * Check if permutations of the given string can be a palindrome
 * @author saurabh
 *
 */
public class PalindromePermutation {

	public static void main(String[] args) {
		String s1 = "tacocat"; //odd length string test case
		String s2 = "doggod";  // even length string test case
		
		String s3 = "tacocatl";
		String s4 = "adoggodl";
		//checkPalindromePermutation(s1);
		System.out.println(checkPalindromePermutation(s1));
		System.out.println(checkPalindromePermutation(s2));
		System.out.println(checkPalindromePermutation(s3));
		System.out.println(checkPalindromePermutation(s4));
	}

	public static boolean checkPalindromePermutation(String s) {

		int[] count_char = new int[128];

		for (char c : s.toCharArray()) {
			count_char[c]++;
		}
		
		boolean flag = false;
		for(int x:count_char) {
			if(x==1 && flag==false) {
				flag = true;
				continue;
			}
			if(x==1 && flag==true) {
				return false;
			}
		}
		return true;
		
		//System.out.println(count_char[108]);
		
	}

}
