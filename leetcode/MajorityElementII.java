import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        // Initialize candidates and their counts
        int candidate1 = nums[0], count1 = 0;
        int candidate2 = nums[0], count2 = 0;
        
        // Voting phase
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        // Verification phase
        count1 = 0;
        count2 = 0;
        
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        
        // Check if candidates are majority elements
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }
        
        return result;
    }

    public static void main(String[] args) {
        MajorityElementII solution = new MajorityElementII();
        int[] nums = {3, 2, 3};
        List<Integer> result = solution.majorityElement(nums);
        System.out.println(result);  // Output: [3]
    }
}
