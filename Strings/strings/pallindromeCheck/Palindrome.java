package strings.pallindromeCheck;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s = "ABBCCBBA";
		String s1 = "ABCD";
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome(s1));
	}
	
	public static boolean isPalindrome(String str) {
		
		int start = 0;
		int end = str.length()-1;
		
		while(start<end) {
			
			if(str.charAt(start)==str.charAt(end)){
				start++;
				end--;
			}else {
				return false;
			}
		}
		return true;
	}

}
