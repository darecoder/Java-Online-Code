package com.CB.BitMasking;

import java.util.Scanner;

public class GetSetBit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(isOdd(n));
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

//    public static int getBit(int n){
//
//    }

    public static void setBit(int n, int i){

    }

    public static void updateBit(int n, int i){

    }
}
