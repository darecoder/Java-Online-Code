package com.CB.TwoDimArrays;

import java.util.Scanner;

public class SumAllSubmatrix {
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

        System.out.println(sumAllSubMatrices(nums));
    }

    public static int sumAllSubMatrices(int[][] nums) {
        int sum = 0, n = nums.length, m = nums[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int topLeft = (i+1) * (j+1);
                int bottomRight = (n-i)*(m-j);

                sum += (topLeft * bottomRight) * nums[i][j];
            }
        }

        return sum;
    }
}
