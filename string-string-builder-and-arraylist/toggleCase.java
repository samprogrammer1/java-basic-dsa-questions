import java.util.*;

public class toggleCase {

    public static String chnageAlphabetsCase(String s){
        StringBuilder sb = new  StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                char c = Character.toLowerCase(s.charAt(i));
                sb.setCharAt( i, c);
            }else{
                char c = Character.toUpperCase(s.charAt(i));
                sb.setCharAt(i,c );
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        scn.close();

        String str = chnageAlphabetsCase(s);

        System.out.println(str);
    }
}
