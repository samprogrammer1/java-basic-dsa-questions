package leetcode;

public class editDistance {
    public static void main(String[] args) {
        String str1 = "kitten";
        String str2 = "sitting";

        int distance = minDistance(str1, str2);
        System.out.println("Edit Distance between \"" + str1 + "\" and \"" + str2 + "\" is: " + distance);
    }

    public static int minDistance(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] constDP = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) constDP[i][0] = i;
        for (int j = 1; j <= n; j++) constDP[0][j] = j;

        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    constDP[i][j] = constDP[i - 1][j - 1];
                } else {
                    int topLeft = constDP[i - 1][j - 1];
                    int top = constDP[i - 1][j];
                    int left = constDP[i][j - 1];
                    constDP[i][j] = Math.min(topLeft, Math.min(top, left)) + 1;
                }

            }
        }

        return constDP[m][n];
    }
}
