package leetcode;

import java.util.Arrays;

public class missingNumber {
    public static int missingNumbers(int[] nums) {
        int n = nums.length;
        
        // Calculate the expected sum using Gauss formula
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference between the expected and actual sums
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missingNumber = missingNumbers(nums);
        System.out.println("Missing Number: " + missingNumber);
    }
}
