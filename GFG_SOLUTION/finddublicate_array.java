package GFG_SOLUTION;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class finddublicate_array {
    public static void main(String[] args) {
        int[] a2 = {2, 3, 1, 2, 3};
        int n2 = a2.length;
        ArrayList<Integer> result2 = duplicates(a2, n2);
        System.out.println(result2); 
    }
    public static ArrayList<Integer> duplicates(int a[], int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int index = a[i] % n;
            int val = a[index] += n;
        }
        for (int i = 0; i < n; i++) {
             
            if ((a[i] / n) > 1) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}
