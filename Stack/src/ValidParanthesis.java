import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    int n = inputReader.nextInt();
    inputReader.nextLine();
    for(int i =0; i<n; i++){
      String s = inputReader.nextLine();
      String result = checkParanthesis(s);
      System.out.println(result);
    }
  }

  private static String checkParanthesis(String s) {
      Stack<Character> chars = new Stack<>();
      for(int i = 0; i<s.length();i++){
        if(s.charAt(i) == '(')
          chars.push(')');
        else if(s.charAt(i) == '{')
          chars.push('}');
        else if(s.charAt(i) == '[')
          chars.push(']');
        else if(chars.peek() == s.charAt(i))
          chars.pop();
        else
          chars.push(s.charAt(i));
      }
      if(chars.isEmpty())
        return "YES";
      else
        return "NO";

    }
}
