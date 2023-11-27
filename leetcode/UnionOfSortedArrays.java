package leetcode;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {13, 17, 18, 19, 20, 22, 22, 27, 36, 39, 46, 48, 50};
        int[] arr2 = {4, 12, 45};

        ArrayList<Integer> unionList = findUnion(arr1, arr2);

        System.out.print("Union of the two arrays: ");
        for (int element : unionList) {
            System.out.print(element + " ");
        }
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> unionList = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                set.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                set.add(arr2[j]);
                j++;
            } else {
                // If both elements are equal, add one of them to the set
                set.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from both arrays to the set, if any
        while (i < arr1.length) {
            set.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            set.add(arr2[j]);
            j++;
        }

        // Convert the set to the array list
        unionList.addAll(set);

        return unionList;
    }
}
