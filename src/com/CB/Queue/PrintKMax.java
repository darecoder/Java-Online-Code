package com.CB.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintKMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        int k = s.nextInt();
        printKMax(nums, k);
    }

    public static void printKMax(int[] nums, int k){
        Deque<Integer> q = new LinkedList<>();
        int i = 0;
        for (i = 0; i < k; i++) {
            while (!q.isEmpty() && nums[i] >= nums[q.getLast()]) {
                q.pop();
            }

            q.add(i);
        }

        for (; i < nums.length; i++) {
            System.out.print(nums[q.getFirst()] + " ");

            while (!q.isEmpty() && q.getFirst() <= i - k) {
                q.remove();
            }

            while (!q.isEmpty() && nums[i] >= nums[q.getLast()]) {
                q.pop();
            }
            q.add(i);
        }

        System.out.println(nums[q.getFirst()]);
    }
}
