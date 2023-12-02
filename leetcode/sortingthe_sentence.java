public class sortingthe_sentence {
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for(String str : arr){
            int i = str.charAt(str.length() -1)- '1';
            res[i] = str.substring(0, str.length() -1);
        }

        return String.join(" ",res);
    }
    public static void main(String[] args) {
        String add = "is2 sentence4 This1 a3";

        System.out.println(sortSentence(add));
    }
}
