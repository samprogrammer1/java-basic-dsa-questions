import java.util.Scanner;

public class StringWithDifference {
    
    /*  
        input :-    pepCODinG
        output :-   p-11e11p-45C12O-11D37i5n-39G      
    */



    public static String difference(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char current_alphabets = s.charAt(i);
            char prev_alphabets = s.charAt(i - 1);
            int differenceOfAlphabets = current_alphabets - prev_alphabets;
            sb.append(differenceOfAlphabets);
            sb.append(current_alphabets);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        scn.close();
        String str = difference(s);
        System.out.println(str);
    }
}
