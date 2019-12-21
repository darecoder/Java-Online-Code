package com.CB.BitMasking;

import java.util.Scanner;

public class UniqueNumberI {
    /*
     Given an array containing n numbers in which all numbers are present twice except for one number
     which is only present once. we have to find that unique number.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int unique = 0;
        for (int i = 0; i < n; i++) {
            unique ^= s.nextInt();
        }

        System.out.println("Unique Number : " + unique);

    }
}
