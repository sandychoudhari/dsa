package com.basics.dsa;

class Stack <T> {

    private int size;
    private T[] arr;
    private int top;

    public Stack(int size){
        this.size = size;
        this.top = -1;
        this.arr = (T[]) new Object[size];
    }

    public Stack(){
        this.top = -1;
        this.arr = (T[]) new Object[10];
    }

    public void push(T element){
        if (!isFull()) {
            top++;
            arr[top] = element;
            System.out.println("Pushed element:" + element);
        }
        else {
            System.out.println("Stack is full..");
        }
    }

    public T pop(){
        if(!isEmpty()){
            int popElement = top;
            System.out.println("Pop Element is : " + arr[popElement]);
            return (T) arr[top--];
        } else {
          System.out.println("Stack is already empty");
          return null;
        }
    }

    public T peek(){
        if(!isEmpty()){
            return (T) arr[top];
        } else {
            System.out.println("Stack is already empty");

        }
        return null;
    }

    public boolean isFull(){
        return (size - 1 == top);
    }

    public boolean isEmpty(){
        return (top == -1);

    }

}

public class TestStack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack(10);
        stack.push(10);
        stack.push(12);
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
