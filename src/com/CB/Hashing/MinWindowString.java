package com.CB.Hashing;

import java.util.Scanner;

public class MinWindowString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        System.out.println(minWinString(s1, s2));
    }

    public static String minWinString(String str, String pat) {
        if (str.length() < pat.length()){
            return "No Window";
        }

        int[] hashPtr = new int[26];
        int[] hashStr = new int[26];

        for (int i = 0; i < pat.length(); i++) {
            hashPtr[pat.charAt(i) - 'a']++;
        }

        int start = 0, startIndex = -1, minLen = Integer.MAX_VALUE, count = 0;

        for (int i = 0; i < str.length(); i++) {
            hashStr[str.charAt(i) - 'a']++;

            if (hashPtr[str.charAt(i) - 'a'] != 0 && hashStr[str.charAt(i) - 'a'] <= hashPtr[str.charAt(i) - 'a']){
                count++;
            }

            if (count == pat.length()){
                while (hashStr[str.charAt(start) - 'a'] > hashPtr[str.charAt(start) - 'a']
                        || hashPtr[str.charAt(start) -'a'] == 0){
                    if(hashStr[str.charAt(start) - 'a'] > hashPtr[str.charAt(start) - 'a']){
                        hashStr[str.charAt(start)-'a']--;
                    }
                    start++;
                }

                int lenWin = i - start + 1;
                if(minLen > lenWin){
                    minLen = lenWin;
                    startIndex = start;
                }
            }
        }

        if (startIndex == -1){
            return "No Window";
        }

        return str.substring(startIndex, startIndex + minLen);
    }
}
