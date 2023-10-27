package hackerrank;

import java.util.List;

public class pickingNumber {
    public static int pickingNumbers(List<Integer> a) {
        final int MAX_VALUE = 100;

        /* Save counts of each number */
        int[] counts = new int[MAX_VALUE];
        for (int num : a) {
            counts[num]++;
        }
        
        
        /* Find adjacent pair with largest sum */
        int max = 2;
        for (int i = 1; i < MAX_VALUE; i++) {
            int adjacentSum = counts[i] + counts[i-1];
            max = Math.max(max, adjacentSum);
        }
        return max;
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> numbers = List.of(1, 2, 2, 3, 1, 2);
        int result = pickingNumbers(numbers);
        System.out.println("The maximum number of elements in a subarray with a difference of 1 is: " + result);
    }
}
