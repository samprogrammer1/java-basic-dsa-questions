package stacks_and_queues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class postfixExpression {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>(); 

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = vs.pop();
                int v1 = vs.pop();
                int vsValue = operation(v1, v2, ch);
                vs.push(vsValue);

                String i2 = is.pop();
                String i1 = is.pop();
                String isValue = "(" + i1 + ch + i2 + ")";
                is.push(isValue);

                String p2 = ps.pop();
                String p1 = ps.pop();
                String psValue = ch + p1 + p2;
                ps.push(psValue);
            }else{
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }

        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());

    }

    public static int operation(int v1 , int v2 , char ops){
        if(ops == '+'){
            return v1 + v2;
        }else if(ops == '-'){
            return v1 - v2;
        }else if(ops == '*'){
            return v1 * v2;
        }else {
            return v1 / v2;
        }

    }
}
