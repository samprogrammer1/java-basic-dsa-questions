public class CountConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];
        
        // Mark allowed characters
        for (char c : allowed.toCharArray()) {
            allowedChars[c - 'a'] = true;
        }
        
        int count = 0;
        
        // Check each word
        for (String word : words) {
            boolean consistent = true;
            
            // Check if each character in the word is allowed
            for (char c : word.toCharArray()) {
                if (!allowedChars[c - 'a']) {
                    consistent = false;
                    break;
                }
            }
            
            // Increment count if the word is consistent
            if (consistent) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        
        int result = countConsistentStrings(allowed, words);
        System.out.println("Number of consistent strings: " + result);
    }
}