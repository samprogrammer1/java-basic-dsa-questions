package string;

import java.util.HashMap;

public class world_pattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> m = new HashMap<>();
        String words[] = s.split(" ");

        if(pattern.length() != words.length) return false;

        int n = words.length;

        for(int i = 0; i < n; i++){
            char c = pattern.charAt(i);
            if(m.containsKey(c)){
                if(!words[i].equals(m.get(c))) return false;
            }else{
                if(m.containsValue(words[i])){
                    return false;
                }
                m.put(c, words[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = wordPattern(pattern, s);
        System.out.println(result); // Output should be true
    }
}
