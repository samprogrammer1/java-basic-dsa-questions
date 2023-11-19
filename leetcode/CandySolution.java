package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CandySolution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList();

        // Find the maximum number of candies
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (max <= candies[i]) {
                max = candies[i];
            }
        }

        // Check if each kid can have the greatest number of candies
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println("Result: " + result);
    }
}
