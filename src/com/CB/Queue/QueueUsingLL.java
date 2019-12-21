package com.CB.Queue;

import java.util.LinkedList;

public class QueueUsingLL<T extends Comparable<T>> {
    LinkedList<T> list;

    //Constructor for default initialization
    public QueueUsingLL() {
        list = new LinkedList<>();
    }

    //To check if Queue is empty
    public boolean isEmpty(){
        return this.list.size() == 0;
    }

    //To add element in Queue
    public void enqueue(T value){
        this.list.add(value);
    }

    //To get peek element
    public T getFront(){
        return this.list.getFirst();
    }

    //To remove element from the queue
    public T dequeue(){
        if(!isEmpty()){
            return this.list.pop();
        }
        return null;
    }
}

//Client class to test the code
class Test2{
    public static void main(String[] args) {
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();

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
