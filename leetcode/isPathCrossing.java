import java.util.HashSet;
import java.util.Set;

public class isPathCrossing {
    public static boolean isPathCrossings(String path) {
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(x + "," + y);

        for (char c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else {
                x--;
            }

            String key = x + "," + y;
            if (set.contains(key)) {
                return true;
            }
            set.add(key);
        }

        return false;
    }

    public static void main(String[] args) {
        
        // Test case 1
        System.out.println(isPathCrossings("NES")); // Output: false
        
        // Test case 2
        System.out.println(isPathCrossings("NESWW")); // Output: true
    }
}
