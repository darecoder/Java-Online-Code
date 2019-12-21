package com.CB.BitMasking;

import java.util.Scanner;

public class FastExponentiation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();

        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        int ans = 1;
        while (n > 0){
            int last_bit = (n & 1);     // To check if power is odd
            if(last_bit == 1){
                ans = ans * x;
            }
            x = x*x;
            n = n>>1;
        }
        return ans;
    }
}
