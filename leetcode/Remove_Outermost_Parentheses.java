
import java.util.Stack;

public class Remove_Outermost_Parentheses {
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (stack.size() >= 1) {
                    str.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            } else {
                if (stack.size() > 1) {
                    str.append(s.charAt(i));
                }
                stack.pop();
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String input = "(()())(())";
        String result = removeOuterParentheses(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
