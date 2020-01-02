package com.CB.Hashing;

import java.util.*;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        int k = s.nextInt();

        System.out.println(subarraySumK(nums, k));
    }

    public static int subarraySumK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];

            if(pre == k){
                len = Math.max(len, i+1);
            }else if(map.containsKey(pre - k)){
                len = Math.max(len, i - map.get(pre-k));
            }else {
                map.put(pre, i);
            }
        }

        return len;
    }
}
