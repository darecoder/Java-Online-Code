package com.CB.Fundamentals1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "xhiellohi";
        System.out.println(removeHi(str, 0));
    }

    public static String removeHi(String str, int ind) {
        if (ind + 1 >= str.length()){
            return str;
        }

        if(ind+2 <= str.length() && str.substring(ind,ind+2).compareTo("hi") == 0){
            return removeHi(str.substring(0,ind)+str.substring(ind+2), ind);
        }else {
            return removeHi(str, ind+1);
        }
    }
}
