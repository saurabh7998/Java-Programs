package strings.patternSearching;

public class NaivePatternSearch {

	public static void main(String[] args) {

		String txt = "GEEKSFORGEEKS";
		String pattern = "EKS";

		getIndex(txt, pattern); // EKS is at index 2 and 10 in GEEKSFORGEEKS

	}

	public static void getIndex(String txt, String pat) {

		int m = pat.length();
		int n = txt.length();
		for (int i = 0; i <= (n - m); i++) {
			int j;
			for (j = 0; j < m; j++)
				if (pat.charAt(j) != txt.charAt(i + j))
					break;

			if (j == m)
				System.out.print(i + " ");
		}

//	    String s =txt.substring(0, 4);
//	    StringBuilder s1 = new StringBuilder(s).reverse();
	}

}
