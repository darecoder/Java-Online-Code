package com.CB.Heap;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomHeap {
    ArrayList<Integer> list;

    public CustomHeap() {
        this.list = new ArrayList<>();
    }

    public void insert(int value){
        this.list.add(value);
        this.upheapify(list.size()-1);
    }

    private void upheapify(int index) {
        if(index == 0){
            return;
        }

        int parent = (index - 1)/2;
//        if
    }

//    public int parent(int index){
//        if()
//    }
    public void display(){

    }
}

class Test{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CustomHeap heap = new CustomHeap();

        for (int i = 0; i < 5; i++) {
            heap.insert(s.nextInt());
        }
    }
}
