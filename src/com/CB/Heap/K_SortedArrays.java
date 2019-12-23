package com.CB.Heap;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class CustomPair<T extends Comparable<T>>{
    Pair<T, Pair<Integer, Integer>> pair;

    public CustomPair(T a, Pair<Integer, Integer> p) {
        this.pair = new Pair<>(a, p);
    }
}

public class K_SortedArrays {
    public static void main(String[] args) {
        int[][] nums = { {7, 10, 15},
                         {1, 6, 20, 32},
                         {2, 3, 17, 26, 59},
                         {13, 27, 34, 44} };

        ArrayList<Integer> list = mergeKSortedArray(nums);

        System.out.println(list);
    }

    public static ArrayList<Integer> mergeKSortedArray(int[][] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<CustomPair<Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(o -> o.pair.getKey()));

        for (int i = 0; i < nums.length; i++) {
            heap.add(new CustomPair<>(nums[i][0], new Pair<>(i, 0)));
        }

        while (!heap.isEmpty()){
            CustomPair<Integer> curr = heap.remove();
            int x = curr.pair.getValue().getKey();
            int y = curr.pair.getValue().getValue();

            result.add(curr.pair.getKey());

            if (y+1 < nums[x].length){
                heap.add(new CustomPair<>(nums[x][y + 1], new Pair<>(x, y + 1)));
            }
        }
        return result;
    }
}
