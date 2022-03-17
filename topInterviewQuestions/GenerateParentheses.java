import java.util.ArrayList;
import java.util.List;

//BackTracking
public class GenerateParentheses {
  //LC #22
  static List<String> res = new ArrayList<>();

  public static void main(String[] args) {
    int n = 3;

    totalGeneratedParentheses(n, 0, 0, "");

    for(String s : res){
      System.out.print(s+ " ");
    }
  }

  public static void totalGeneratedParentheses(int n, int open, int close,
                                               String s) {
    if (s.length() == n * 2) {
      res.add(s);
      return;
    }

    if (open < n) {
      totalGeneratedParentheses(n, open + 1, close, s + '(');
    }
    if (close < open) {
      totalGeneratedParentheses(n, open, close + 1, s + ')');
    }

  }


}
