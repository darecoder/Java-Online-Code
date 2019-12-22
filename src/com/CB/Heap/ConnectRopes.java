package com.CB.Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ConnectRopes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        //Add the lengths of all the ropes respectively
        for (int i = 0; i < n; i++) {
            heap.add(s.nextInt());
        }

        System.out.println(connectRopesWithMinCost(heap));
    }

    //Method to calculate the mo=inimum cost of joining all the ropes
    public static int connectRopesWithMinCost(PriorityQueue<Integer> heap) {
        int cost = 0;

        while (heap.size() > 1){
            //Pop two minimum cost ropes and join them
            int first = heap.remove();
            int second = heap.remove();

            //Find the cost of joining these two ropes
            int curr_cost = first + second;

            //Update the total cumulative cost
            cost += curr_cost;

            //Add the new rope made from joining these two
            heap.add(curr_cost);
        }

        return cost;
    }
}
