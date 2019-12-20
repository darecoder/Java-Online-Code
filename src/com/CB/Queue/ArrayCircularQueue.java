package com.CB.Queue;

public class ArrayCircularQueue {

    int[] data;
    int max_size;
    int curr_size;
    int front;
    int rear;

    public ArrayCircularQueue(int size) {
        max_size = size;
        data = new int[max_size];
        this.front = 0;
        this.rear = max_size - 1;
        this.curr_size = 0;
    }

    //To check if the Queue is already full
    public boolean isfull(){
            return this.curr_size == this.max_size;
    }

    //To check if Queue is empty
    public boolean isEmpty(){
            return this.curr_size == 0;
    }

    //To add element in Queue
    public void enqueue(int value){
        if (!isfull()){
            this.rear = (this.rear + 1) % this.max_size;
            this.data[rear] = value;
            this.curr_size++;
        }
    }

    //To remove element from the queue
    public void dequeue(){
        if (!isEmpty()){
            this.front = (this.front + 1) % this.max_size;
            this.curr_size--;
        }
    }

    //To get peek element
    public int getFront(){
        return this.data[front];
    }

}

class Test{
    public static void main(String[] args) {
        ArrayCircularQueue queue = new ArrayCircularQueue(5);

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
