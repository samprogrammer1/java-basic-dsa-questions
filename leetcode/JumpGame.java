package leetcode;

public class JumpGame {
    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 3, 1, 1, 4};
        Solution solution = new Solution();
        boolean result = solution.canJump(nums);
        System.out.println(result); // Output: true
    }

    public boolean canJump(int[] nums) {
        int goal_jump = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int diff_jump = i + nums[i];
            if (diff_jump >= goal_jump) {
                goal_jump = i;
            }
        }

        return (goal_jump == 0);
    }
}
