package com.CB.Queue;

public class ArrayCircularQueue {

    int[] data;
    int max_size;       //Maximum capacity of Queue
    int curr_size;      //Total no. of current elements in the queue
    int front;
    int rear;

    //Constructor for default initialization
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
            //Calculate index of rear end
            this.rear = (this.rear + 1) % this.max_size;
            this.data[rear] = value;
            this.curr_size++;
        }
    }

    //To remove element from the queue
    public int dequeue(){
        if (!isEmpty()){
            int temp = this.data[front];
            //Calculate index of front end
            this.front = (this.front + 1) % this.max_size;
            this.curr_size--;
            return temp;
        }
        return -1;
    }

    //To get peek element
    public int getFront(){
        return this.data[front];
    }

}

//Client class to test the code
class Test{
    public static void main(String[] args) {
        ArrayCircularQueue queue = new ArrayCircularQueue(5);
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }

        System.out.println(queue.dequeue());
        queue.enqueue(8);
        while (!queue.isEmpty()){
            System.out.println(queue.getFront());
            queue.dequeue();
        }
    }
}
