package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countMatches {
    public static int count(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int ruleIndex = 0;

        if (ruleKey.equals("type")) {
            ruleIndex = 0;
        } else if (ruleKey.equals("color")) {
            ruleIndex = 1;
        } else if (ruleKey.equals("name")) {
            ruleIndex = 2;
        }

        for (List<String> item : items) {
            if (item.get(ruleIndex).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // Example usage:
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        int result = count(items, ruleKey, ruleValue);

        System.out.println("Number of items matching the rule: " + result);
    }
}
