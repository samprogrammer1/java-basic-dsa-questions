import java.util.*;

public class balanced_bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        sc.close();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                boolean checkval = checkBracket(st, ')');
                if(checkval == false){
                    System.out.print(checkval);
                    return;
                }
            }else if(ch == '}'){
                boolean checkval = checkBracket(st, '}');
                if(checkval == false){
                    System.out.print(checkval);
                    return;
                }
            }else if(ch == ']'){
                boolean checkval = checkBracket(st, ']');
                if(checkval == false){
                    System.out.print(checkval);
                    return;
                }
            }
        }

        if(st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static boolean checkBracket(Stack<Character> st ,char checkCh ){
        if(st.size() == 0){
            return false;
        }else if(st.peek() == checkCh){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}
