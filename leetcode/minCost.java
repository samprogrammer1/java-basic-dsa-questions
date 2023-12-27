public class minCost {
    public static int minCostA(String colors, int[] neededTime) {
        int prev = -1;
        int minTime = 0;

        for (int i = 0; i < colors.length(); i++) {
            if (prev == -1 || colors.charAt(prev) != colors.charAt(i)) {
                prev = i;
            } else {
                if (neededTime[prev] < neededTime[i]) {
                    minTime += neededTime[prev];
                    prev = i;
                } else {
                    minTime += neededTime[i];
                }
            }
        }

        return minTime;
    }

    public static void main(String[] args) {
        // Example usage:
        String colors = "aabb";
        int[] neededTime = {1, 2, 1, 2};
        int result = minCostA(colors, neededTime);
        System.out.println("Minimum Cost: " + result);
    }
}
