import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumSorted(i + 1, nums.length - 1, nums, 0 - nums[i]);
            }
        }

        return res;
    }

    

    private static void twoSumSorted(int i, int j, int[] nums, int target) {
        int a1 = nums[i - 1];

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(a1);
                list.add(nums[i]);
                list.add(nums[j]);

                res.add(list);

                // duplicate b
                while (i < j && nums[i] == nums[i + 1])
                    i++;

                // duplicate c
                while (i < j && nums[j] == nums[j - 1])
                    j--;

                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        // Example input array
        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Calling the threeSum method
        List<List<Integer>> result = threeSum(nums);

        // Printing the result
        System.out.println("Triplets with sum zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
