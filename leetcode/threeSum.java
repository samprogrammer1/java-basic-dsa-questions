import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i - 1] == nums[i]) continue;

            int left = i +1;
            int right = nums.length -1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }else if( sum < 0){
                    left++;
                }else {
                    right--;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        // Example input array
        int[] nums = {0,1,1};

        // Calling the threeSum method
        List<List<Integer>> result = threeSum(nums);

        // Printing the result
        System.out.println("Triplets with sum zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
