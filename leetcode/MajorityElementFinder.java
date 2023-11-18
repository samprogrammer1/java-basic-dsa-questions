package leetcode;

public class MajorityElementFinder {
    public static int majorityElement(int[] nums) {
        int ans = nums[0], vote = 1;

        for (int i = 1; i < nums.length; i++) {
            if (vote == 0) {
                vote++;
                ans = nums[i];
            } else if (ans == nums[i]) {
                vote++;
            } else {
                vote--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(nums);
        System.out.println("The majority element is: " + result);
    }
}
