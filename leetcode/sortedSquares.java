

public class sortedSquares {
    public static int[] sortedSquaresValue(int[] nums) {
        int[] ans = new int[nums.length];
        int low = 0, high = nums.length - 1;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (absoluteValue(nums[low]) >= absoluteValue(nums[high])) {
                ans[i] = nums[low] * nums[low];
                low++;
            } else {
                ans[i] = nums[high] * nums[high];
                high--;
            }
        }
        
        return ans;
    }

    // Get the absolute value without using Math.abs
    private static int absoluteValue(int x) {
        return x >= 0 ? x : -x;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquaresValue(nums);

        System.out.print("Sorted Squares: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
