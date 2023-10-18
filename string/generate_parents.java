package string;

import java.util.LinkedList;
import java.util.List;

public class generate_parents {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<String>();
        process("", n, n, result);
        return result;
    }

    private static void process(String prefix, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(prefix);
            return;
        }
        if (left > 0) {
            process(prefix + '(', left - 1, right, result);
        }
        if (left < right) {
            process(prefix + ')', left, right - 1, result);
        }
    }
    public static void main(String[] args) {
        int n = 3; // You can change this to the value of 'n' you want.

        List<String> result = generateParenthesis(n);

        // Print the generated valid parentheses combinations
        for (String combination : result) {
            System.out.println(combination);
        }
    }
}
