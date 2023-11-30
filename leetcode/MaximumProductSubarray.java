

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = maxProduct;

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int tempMax = Math.max(Math.max(maxProduct * current, minProduct * current), current);
            minProduct = Math.min(Math.min(maxProduct * current, minProduct * current), current);
            maxProduct = tempMax;

            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums));
    }
}
