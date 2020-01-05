package com.CB.TwoDimArrays;

import java.util.Scanner;

public class MaxSumSubMatrixSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] nums = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = s.nextInt();
            }
        }

        System.out.println(maxSumSubMatrix(nums));
    }

    public static int maxSumSubMatrix(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-2; j >= 0; j--) {
                nums[i][j] += nums[i][j+1];
            }
        }

        for (int i = m-1; i >= 0; i--) {
            for (int j = n-2; j >= 0; j--) {
                nums[j][i] += nums[j+1][i];
            }
        }

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result = Math.max(result, nums[i][j]);
            }
        }

        return result;
    }
}
