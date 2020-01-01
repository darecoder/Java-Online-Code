package com.CB.Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubarraySumZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(SubarraySumZero(nums));
    }

    public static boolean SubarraySumZero(int[] nums){
        Set<Integer> set = new HashSet<>();
        int pre = 0;
        for (int num : nums) {
            pre += num;
            if (pre == 0 || set.contains(pre)) {
                return true;
            } else {
                set.add(pre);
            }
        }
        return false;
    }
}
