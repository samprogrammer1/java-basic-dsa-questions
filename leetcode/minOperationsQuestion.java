public class minOperationsQuestion {
    public static int minOperations(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                count += (s.charAt(i) == '0') ? 1 : 0;
            } else {
                count += (s.charAt(i) == '1') ? 1 : 0;
            }
        }

        int complementCount = s.length() - count;
        if (count < complementCount) {
            return count;
        } else {
            return complementCount;
        }
    }

    public static void main(String[] args) {
        String input = "010101";
        int result = minOperations(input);
        System.out.println(result);
    }
}


