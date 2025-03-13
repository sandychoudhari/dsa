package com.basics.dsa;

/**
 * The TestStackLinkedList class provides a linked list implementation of a stack.
 * It supports typical stack operations such as push, pop, and display.
 */
public class TestStackLinkedList {

    /**
     * The top node of the stack.
     */
    Node top;

    /**
     * The size of the stack.
     */
    int size;

    /**
     * The Node class represents a node in the linked list.
     */
    class Node {
        /**
         * The data stored in the node.
         */
        int data;

        /**
         * The next node in the linked list.
         */
        Node next;

        /**
         * Constructs a new node with the specified data.
         *
         * @param data the data to be stored in the node
         */
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Pushes a new element onto the stack.
     *
     * @param data the data to be pushed onto the stack
     */
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    /**
     * Pops an element from the stack.
     *
     * @return the data of the popped element, or -1 if the stack is empty
     */
    public int pop() {
        if (!isEmpty()) {
            Node current = top;
            top = current.next;
            size--;
            return current.data;
        }
        return -1;
    }

    /**
     * Displays the elements in the stack.
     */
    public void display() {
        Node current = top;
        if (!isEmpty()) {
            System.out.println("Elements in the stack:");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        } else {
            System.out.println("No elements in the stack");
        }
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * The main method to test the stack operations.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestStackLinkedList testStackLinkedList = new TestStackLinkedList();
        testStackLinkedList.push(50);
        testStackLinkedList.push(60);
        testStackLinkedList.push(70);

        testStackLinkedList.display();

        testStackLinkedList.pop();
        System.out.println("After popping an element:");

        testStackLinkedList.display();
    }
}