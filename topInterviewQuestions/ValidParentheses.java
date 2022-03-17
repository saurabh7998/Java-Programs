import java.util.Stack;

public class ValidParentheses {

  public static void main(String[] args) {
    String s1 = "(){}[]";
    String s2 = "[({}){()}[]]";
    String s3 = "(()}]";


    System.out.println(s1 + " " + isValid(s1));
    System.out.println(s2 + " " + isValid(s2));
    System.out.println(s3 + " " + isValid(s3));
  }

  public static boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();

    int i=0;
    while(i<s.length()){
      if(s.charAt(i) == '('){
        stack.push(')');
      }
      else if(s.charAt(i) == '{'){
        stack.push('}');
      }
      else if (s.charAt(i) == '['){
        stack.push(']');
      }
      else if(stack.isEmpty() || stack.pop() != s.charAt(i)){
        return false;
      }
      i++;
    }

    return stack.isEmpty();
  }
}
