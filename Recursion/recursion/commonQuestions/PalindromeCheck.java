package recursion.commonQuestions;

public class PalindromeCheck {

	public static void main(String[] args) {

		String string = "abccba"; // true
		int start = 0;
		int end = string.length() - 1;

		String string1 = "abc"; // false
		int end1 = string1.length() - 1;

		System.out.println(palindromeCheck(string, start, end)); // true
		System.out.println(palindromeCheck(string1, start, end1));// false

	}

	public static boolean palindromeCheck(String str, int start, int end) {

		if (str.charAt(start) == str.charAt(end)) {
			start++;
			end--;
		} else {
			return false;
		}
		
		if (start >= end) {
			return true;
		}

		return palindromeCheck(str, start, end);

	}
	
	
	/*
	 * Alternative and compact way to write the above function:
	 
	public static boolean palindromeCheck(String str, int start, int end) {

		if(start>=end) {
			return true;
		}
		
		return (str.charAt(start)==str.charAt(end) && palindromeCheck(str, start+1, end-1));
		

	}*/
	

}
