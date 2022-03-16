package strings.InterviewQuestions;

/**
 * Check if s1 can be made equal to s2 by doing at most one of these operations: delete, insert, replace
 * @author saurabh
 *
 */
public class OneAway {
	
	public static void main(String[] args) {
		
		String s1 = "aple";
		String s2 = "apple";
		
		String s3 = "job";
		String s4 = "bob";
		
		String s5 = "Hello";
		String s6 = "Helloo";
		
		//This will require 2 operations: 1.change 'd' to 'g' and 2. change 'g' to 'd'
		String s7 = "dog";
		String s8 = "god";
		
		System.out.println(isOneAway(s1, s2));
		System.out.println(isOneAway(s3, s4));
		System.out.println(isOneAway(s5, s6));
		System.out.println(isOneAway(s7, s8));


		
		
	}
	
	public static boolean isOneAway(String s1, String s2) {
		if(Math.abs(s1.length()-s2.length())>1) {
			return false;
		}
			
		if(s1.length()==s2.length()) {
			return replace(s1, s2);
		}
		
		String first = s1.length()>s2.length() ? s1:s2; //larger string
		String second = s1.length()>s2.length() ? s2:s1;//smaller string
		
		return insertOrDelete(first,second);
		
		
	}
	
	public static boolean insertOrDelete(String first, String second) {
		int index1=0;
		int index2=0;
		
		while(index1<first.length() && index2<second.length()) {
			
			if(first.charAt(index1)!=second.charAt(index2)) {
				if(index1!=index2) {
					return false;
				}
				index1++;
			}else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	
	public static boolean replace(String s1, String s2) {
		boolean flag = false;
		for(int i=0; i<s2.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				if(flag) {
					return false;
				}
				flag = true;
			}
		}
		return true;
		
	}

}
