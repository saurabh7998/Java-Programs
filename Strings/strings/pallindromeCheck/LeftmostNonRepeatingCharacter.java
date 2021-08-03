package strings.pallindromeCheck;

public class LeftmostNonRepeatingCharacter {
	
	static int CHAR = 256;

	public static void main(String[] args) {

		String str = "geeksforgeeks"; // 'g' is the first repeating character
		System.out.println(getIndex(str)); // O/P: 0 ('g' is at index 0)
	}
	
	public static int getIndex(String str) {
		
		int count[] = new int[CHAR];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(count[str.charAt(i)]<2) {
				return i;
			}
		}
		
		return -1;
		
	}

}
