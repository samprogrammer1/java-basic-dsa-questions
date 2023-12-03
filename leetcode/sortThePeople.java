import java.util.Arrays;
import java.util.HashMap;

public class sortThePeople {
     public static String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];

        HashMap<Integer, String> res = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            res.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index++] = res.get(heights[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        // Example usage
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] heights = {165, 180, 170};

        String[] sortedPeople = sortPeople(names, heights);

        // Print the sorted array
        for (String person : sortedPeople) {
            System.out.println(person);
        }
    }
}
