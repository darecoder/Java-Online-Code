package com.CB.Heap;

import javafx.util.Pair;

import java.util.ArrayList;

public class K_SortedArrays {
    public static void main(String[] args) {
        int[][] nums = { {3, 7, 10, 15},
                         {1, 6, 20, 32},
                         {2, 3, 7, 26},
                         {13, 27, 34, 44} };

        ArrayList<Integer> list = mergeKSortedArray(nums);

        System.out.println(list);
    }

    public static ArrayList<Integer> mergeKSortedArray(int[][] nums) {
    }
}
