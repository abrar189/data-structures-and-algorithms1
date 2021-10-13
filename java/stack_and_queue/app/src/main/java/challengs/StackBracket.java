package challengs;

public class StackBracket {
  public boolean ValidateBrackets(String string) {
    Stack<Character> BracketsStack = new Stack<>();
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '(') {
        BracketsStack.push((string.charAt(i)));
      } else {
        if (BracketsStack.isEmpty()) {
          return false;
        }
        if (string.charAt(i) == '}' && BracketsStack.peek() == '{' ||
          string.charAt(i) == ']' && BracketsStack.peek() == '[' ||
          string.charAt(i) == ')' && BracketsStack.peek() == '(') {
          BracketsStack.pop();

        }

      }
    }
    return BracketsStack.isEmpty();
  }
}
