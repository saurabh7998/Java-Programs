package strings.pallindromeCheck;

import java.util.ArrayList;
import java.util.List;

public class ReverseWord1 {

	public static void main(String[] args) {

		String str = "Saurabh is great";
		char[] s = str.toCharArray();

		System.out.println("After the reverse the string changes to: ");
		reverseWords(s);
		System.out.println(s);
		
		
	}

	public static void reverseWords(char[] s1) {

		/*
		 * "Saurabh is great" 1. First reverse the individual words 2. Then reverse the
		 * whole string and print
		 *
		 * Demo: 
		 * 1. hbaruaS si tearg 
		 * 2. great is Saurabh // The original string is thus reversed!
		 * 
		 **/

		int start = 0;
		for (int end = 0; end < s1.length; end++) {

			if (s1[end] == ' ') {
				reverse(s1, start, end - 1); // reverse the string till the character before space (i.e. reverse
												// previous word)
				start = end + 1; // Set start of the next word as the index after end (i.e. index after the
									// 'space')
			}
		}
		// The above loop will not reverse the Last Word, because there is no space
		// after the last word.
		// So we reverse the last word separately
		reverse(s1, start, s1.length - 1);

		// Now reverse the entire String to get our desired output:
		reverse(s1, 0, s1.length - 1);
	}

	public static void reverse(char[] str, int low, int high) {
		while (low <= high) {
			// swap
			char temp = str[low];
			str[low] = str[high];
			str[high] = temp;
			//
			low++;
			high--;
		}
	}

}
