
import java.util.Arrays;

public class h_index {
     public static int hIndex(int[] citations) {
        // array reverse
        Arrays.sort(citations);
        int n = citations.length;
        int hIndex = 0;

        for (int i = 0; i < n; i++) {
            int h = Math.min(citations[i], n -i);
            hIndex = Math.max(hIndex, h);
        }

        return hIndex;
    }

    public static void main(String[] args) {
        int[] citations1 = {3, 0, 6, 1, 5};
        int[] citations2 = {1, 3, 1};

        int hIndex1 = hIndex(citations1);
        int hIndex2 = hIndex(citations2);

        System.out.println("H-Index 1: " + hIndex1); // Output: 3
        System.out.println("H-Index 2: " + hIndex2); // Output: 2
    }
}
