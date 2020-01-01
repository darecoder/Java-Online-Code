package com.CB.Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LengthSubarraySumZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(LenSubarraySumZero(nums));
    }

    public static boolean LenSubarraySumZero(int[] nums){
        Set<Integer> set = new HashSet<>();
        int pre = 0;
        int len = 0;

        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if(nums[i] == 0 && len == 0){
                len++;
            }else if (pre == 0){
                Math.max(len, i + 1);
            }else if (set.contains(pre)){
                len = Math.max(len, i - nums[pre]);
            }else {

            }
        }
        return false;
    }
}
