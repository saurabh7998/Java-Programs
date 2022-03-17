import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

  public static void main(String[] args) {
    String inp1 = "abcabcbb"; //Output : 3 (abc)

    String inp2 = "bbbbb";  //Output : 1 (b)

    System.out.println(longestString(inp1));
    System.out.println(longestString(inp2));

  }


  public static int longestString(String s) {
    Set<Character> res = new HashSet<>();

    int answer = 0;

    int i = 0;
    int j = 0;

    while (i < s.length()) {
      if (!res.contains(s.charAt(i))) {
        res.add(s.charAt(i));
        answer = Math.max(answer, res.size());
        i++;
      } else {
        res.remove(s.charAt(j));
        j++;
      }
    }


    return answer;
  }


}
