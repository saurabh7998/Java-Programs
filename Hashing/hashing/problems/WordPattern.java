package hashing.problems;

import java.util.HashMap;

public class WordPattern {
	
	public static void main(String[] args) {
		
		String pattern = "abba";
		String s = "dog cat cat dog"; // this is same like a b b a, hence true;
		
		String pattern1 = "abba";
		String s1 = "dog dog dog dog";  //false
		
		System.out.println(wordPattern(pattern, s));
		System.out.println(wordPattern(pattern1, s1));

	}

	public static boolean wordPattern(String pattern, String s) {

		String[] strArray = s.split(" ");
		HashMap<Character, String> m = new HashMap<>();

		if (strArray.length != pattern.length()) {
			return false;
		}

		for (int i = 0; i < pattern.length(); i++) {

			char ch = pattern.toCharArray()[i];
			if (m.containsKey(ch)) {
				if (!m.get(ch).equals(strArray[i])) {
					return false;
				}
			} else {
				if (m.containsValue(strArray[i]))
					return false;
				m.put(ch, strArray[i]);
			}
		}

		return true;

	}
}
