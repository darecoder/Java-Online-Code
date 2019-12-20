package com.CB.Queue;

import java.util.LinkedList;

public class QueueUsingLL {
    LinkedList<Integer> list;
    public QueueUsingLL() {
        list = new LinkedList<>();
    }

    public boolean isEmpty(){
        return this.list.size() == 0;
    }

    public void enqueue(int value){
        this.list.add(value);
    }

    public int getFront(){
        return this.list.getFirst();
    }

    public void dequeue(){
        if(!isEmpty()){
            this.list.pop();
        }
    }
}

class Test2{
    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();

        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }

        queue.dequeue();
        queue.enqueue(8);
        while (!queue.isEmpty()){
            System.out.println(queue.getFront());
            queue.dequeue();
        }
    }
}
