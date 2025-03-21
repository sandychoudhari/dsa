package com.basics.dsa;


class Queue <T>{

    int size;
    int front =-1, back = -1;
    T [] arr;

    public Queue(){
        this.size = 10;
        this.arr = (T[])new Object[10];
    }

    public void enque(T element){
        if(isFull()){
            System.out.println("Queue is full");
        } else if(front == -1 && back == -1){
            front++;
            back ++;
            arr[back] = element;
        } else {
            back++;
            arr[back] = element;
        }
    }

    public T deque(){
        T type;
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else if(front == back){
            type = arr[front];
            front = back = -1;
            return type;
        } else {
            type = arr[front];
            front++;
            return type;
        }
        return null;
    }

    public boolean isEmpty(){
        return  (front == -1 && back == -1);
    }

    public boolean isFull(){
        return  (back == size-1);
    }
}
public class TestQueue {


    public static void main(String[] args) {
        Queue<Integer> queue = new Queue();
        queue.enque(10);
        queue.enque(20);
        System.out.println(queue.deque());
    }



}
