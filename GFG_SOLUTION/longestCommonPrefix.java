package GFG_SOLUTION;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < minLen; i++){
            char currentChar = strs[0].charAt(i);
            boolean isCommon = true;

            for(String str : strs){
                if(str.charAt(i) != currentChar){
                    isCommon = false;
                    break;
                }
            }
            if(isCommon){
                prefix.append(currentChar);
            }else{
                break;
            }
        }

        return prefix.toString();
    }
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2)); // Output: ""
    }
}
