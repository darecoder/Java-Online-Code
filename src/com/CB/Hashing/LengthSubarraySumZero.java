package com.CB.Hashing;

import java.util.*;

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

    public static int LenSubarraySumZero(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        int len = 0;

        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if(nums[i] == 0 && len == 0){
                len++;
            }else if (pre == 0){
                len = Math.max(len, i + 1);
            }else if (map.containsKey(pre)){
                len = Math.max(len, i - map.get(pre));
            }else {
                map.put(pre, i);
            }
        }

        return len;
    }
}
