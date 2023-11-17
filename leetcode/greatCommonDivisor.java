package leetcode;

public class greatCommonDivisor {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int a = str1.length(), b = str2.length();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return str1.substring(0, a);
    }

    public static void main(String[] args) {
        // Example usage:
        String str1 = "ABCABC";
        String str2 = "ABC";
        String result = gcdOfStrings(str1, str2);
        System.out.println("GCD of " + str1 + " and " + str2 + " is: " + result);
    }
}
