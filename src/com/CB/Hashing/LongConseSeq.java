package com.CB.Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongConseSeq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(longConsSeq(nums));
    }

    public static int longConsSeq(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int ans = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i]-1)){
                continue;
            }else {
                count = 0;
                int x = nums[i];
                while (set.contains(x)){
                    count++;
                    x++;
                }
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}
