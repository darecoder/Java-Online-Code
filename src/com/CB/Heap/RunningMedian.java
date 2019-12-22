package com.CB.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //MinHeap for left sub-tree
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //MaxHeap for right sub-tree
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        //Total no. of elements
        int n = s.nextInt();

        int median = s.nextInt();
        maxHeap.add(median);

        //When there is only one element, median is the no. itself
        System.out.println(median);

        for (int i = 1; i < n; i++) {
            int num = s.nextInt();

            //To decide in which sub-tree the no. should be added
            if (median < num){
                minHeap.add(num);
            }else {
                maxHeap.add(num);
            }

            //To check whether the heaps are balanced or not
            if(Math.abs(maxHeap.size() - minHeap.size()) > 1){

                //Balancing the sub trees
                if(maxHeap.size() > minHeap.size()){
                    minHeap.add(maxHeap.remove());
                }else {
                    maxHeap.add(minHeap.remove());
                }
            }

            //Calculate median
            if(i % 2 == 1){     //If no. of elements are even
                System.out.println((maxHeap.peek() + minHeap.peek()) / 2);
            }else {     //If no. of elements are odd
                if (maxHeap.size() > minHeap.size()){
                    System.out.println(maxHeap.peek());
                }else {
                    System.out.println(minHeap.peek());
                }
            }
        }
    }
}
