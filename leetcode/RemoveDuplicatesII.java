
import java.util.Arrays;

public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int uniqueIndex = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex - 2]) {
                // Move unique elements to the front of the array
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        // The length of the array with at most two duplicates is (uniqueIndex)
        return uniqueIndex;
    }

    public static void main(String[] args) {
        RemoveDuplicatesII solution = new RemoveDuplicatesII();
        int[] nums = {1, 1, 1, 2, 2, 3};

        int newLength = solution.removeDuplicates(nums);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("New Length: " + newLength);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
