package strings.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
/**
 * Check if the string has all unique characters
 * @author saurabh
 *
 */
public class IsUnique {

	public static void main(String[] args) {

		String s1 = "Saurabh";
		String s2 = "Sahil";

		System.out.println(isUnique(s1));
		System.out.println(isUnique(s2));
		System.out.println("");

		System.out.println(isUnique1(s1));
		System.out.println(isUnique1(s2));
		System.out.println("");

		System.out.println(isUnique2(s1));
		System.out.println(isUnique2(s2));
	}

	/**
	 * Big O(n^2)
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isUnique(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Big O(n)
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isUnique1(String s) {

		// There are only 128 ASCII unique characters
		if (s.length() > 128) {
			return false;
		}

		boolean[] char_set = new boolean[128];

		for (int i = 0; i < s.length(); i++) {
			char val = s.charAt(i);

			if (char_set[val] == true) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	/**
	 * Using HashMap DS , Big O(n)
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isUnique2(String s) {

		// There are only 128 ASCII unique characters
		if (s.length() > 128) {
			return false;
		}

		HashMap<Character, Integer> hm = new HashMap<>();

		for (char c : s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				return false;
			}
		}
		return true;
	}

}
