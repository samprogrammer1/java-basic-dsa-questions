import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class prefixExpression {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String exp = bf.readLine();

        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int vs2 = vs.pop();
                int vs1 = vs.pop();
                int vsVal = operation(vs1, vs2 , ch);
                vs.push(vsVal);


                String is2 = is.pop();
                String is1 = is.pop();
                String isVal = "(" + is1 + ch + is2 + ")";
                is.push(isVal);

                String ps2 = ps.pop();
                String ps1 = ps.pop();
                String psVal = ps1 + ps2 + ch;

                ps.push(psVal);
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

    public static int operation(int v1 , int v2, char c){
        if(c == '+'){
            return v1 + v2;
        }else if(c == '-'){
            return v1 - v2;
        }else if(c == '*') {
            return v1 * v2;
        }else{
            return v1 / v2;
        }
    }
}
