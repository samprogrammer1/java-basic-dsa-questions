
import java.util.*;

public class MaxKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        // Sort the array
        Arrays.sort(nums);

        // Use two pointers approach
        int left = 0;
        int right = nums.length - 1;
        int result = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                // If the sum is equal to k, increment the result and move both pointers
                result++;
                left++;
                right--;
            } else if (sum < k) {
                // If the sum is less than k, move the left pointer to the right
                left++;
            } else {
                // If the sum is greater than k, move the right pointer to the left
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Example usage
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        int result = maxOperations(nums, k);
        System.out.println("Maximum number of k-sum pairs: " + result);
    }
}
