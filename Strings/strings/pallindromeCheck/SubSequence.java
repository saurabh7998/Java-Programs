package strings.pallindromeCheck;

public class SubSequence {

	public static void main(String[] args) {

		String s1 = "SAURABH";
		String s2 = "HRA";
		String s3 = "ARH";

		System.out.println(isSubSequence(s1, s2));
		System.out.println(isSubSequence(s1, s3));

	}

	public static boolean isSubSequence(String s1, String s2) {

		int i = 0, j = 0;
		while (i < s1.length()) {

			if (s1.length() < s2.length()) {
				return false;
			}

			if (j == s2.length() - 1) {
				return true;
			}

			if (s1.charAt(i) == s2.charAt(j)) {
				i++;
				j++;
			} else {
				i++;
			}
		}
		return false;

	}

}
