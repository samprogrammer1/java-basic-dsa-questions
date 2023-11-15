package leetcode;

import java.util.Stack;

public class basicCalculator {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number *= 10;
                number += c - '0';
            } else if (c == '+' || c == '-') {
                result += sign * number;
                number = 0;
                sign = (c == '+') ? 1 : -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }

        if (number != 0) {
            result += sign * number;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate("1 + 1")); // Output: 2
        System.out.println(calculate("2-1 + 2")); // Output: 3
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)")); // Output: 23
        System.out.println(calculate("1-(     -2)")); // Output: 3
    }
}
