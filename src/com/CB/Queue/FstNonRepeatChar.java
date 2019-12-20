package com.CB.Queue;

import java.util.*;

public class FstNonRepeatChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Queue<Character> q = new LinkedList<>();
        Map<Character, Integer> map = new HashMap<>();

        char ch = s.next().charAt(0);
        while (ch != '.'){
            q.add(ch);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch, 1);
            }

            while (!q.isEmpty()){
                if(map.get(q.peek()) > 1){
                    q.remove();
                }else {
                    System.out.println(q.peek());
                    break;
                }
            }

            if (q.isEmpty()){
                System.out.println("-1");
            }

            ch = s.next().charAt(0);
        }


    }
}
