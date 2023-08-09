public class ArrayCheck {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int one = haystack.length();
        int two = needle.length();
        
        if (two == 0) {
            System.out.println(0); // Edge case: needle is an empty string
        }
        
        for (int i = 0; i < one - two + 1; ++i){
            boolean found = true;
            
            for (int j = 0; j < two; j++) {
                System.out.print(" i value "+ i+ " ");
                System.out.print(i + j);
                System.out.print(" j value "+ j);
                
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    System.out.print(" run false ");
                    System.out.println();
                    found = false;
                    break;
                }
                System.out.println();
            }
            System.out.print(" i value "+ i+ " ");
            System.out.println();
            if (found) {
                System.out.println(i); ;
            }
        }
        System.out.println(-1);
    }
}
