public class isSorted {
    
    public static boolean check(int[] nums) {
        int cnt = 0;
        for (int i = 0, n = nums.length; i < n; ++i) {
            if (nums[i] > nums[(i + 1) % n]) {
                ++cnt;
            }
        }
        return cnt <= 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(check(arr));

    }
}
