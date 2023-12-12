public class FindPeakElement {
    
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // If the element at mid is greater than the element to its right,
                // a peak element must exist in the left subarray (including mid).
                right = mid;
            } else {
                // If the element at mid is less than or equal to the element to its right,
                // a peak element must exist in the right subarray (excluding mid).
                left = mid + 1;
            }
        }

        // 'left' or 'right' is the peak element.
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element is at index: " + peakIndex);
    }
}
