package strings.pallindromeCheck;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "silent";
		String s2 = "listen";
		
		System.out.println(isAnagram(s1, s2));
		
		
	}
	
	public static boolean isAnagram(String s1, String s2) {
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String s3 = new String(ch1);
		String s4 = new String(ch2);
		
		return s3.equals(s4);
	}

}
