import java.util.*;

public class xyz{

      /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 3;
        findSubsets(n, new ArrayList<Integer>());
    }


    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i <subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }

        // if gets added
        findSubsets(n - 1, subset);
        subset.add(n);

        // won't be added
        findSubsets(n-1, subset);
        subset.remove(subset.size() - 1);
    }

    /**
     * @param args
     */
  
}