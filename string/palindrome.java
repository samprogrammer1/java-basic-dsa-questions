package string;

public class palindrome {
    public static void main(String[] args) {
        String s = "abcbae";
        boolean value = isPalindrome(s);
        System.out.println(value);
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while(i <= j){
            if(!Character.isLetterOrDigit(str.charAt(i) )){
                i++;
            }else if(!Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }else{
                if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                    return false;
                }
                i++;
                j--;
            }

           
        }

        return true;
    }
}
