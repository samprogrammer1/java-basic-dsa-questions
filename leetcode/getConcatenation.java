package leetcode;

public class getConcatenation {
    public static int[] getConcatenationValue(int[] nums) {
        final int n = nums.length;

        int[] ans = new int[n * 2];

        for (int i = 0; i < n; ++i) {
            ans[i] = ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3};
        int[] concatenatedArray = getConcatenationValue(inputArray);

        // Print the concatenated array
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }
}
