

package com.basics.dsa;

class SinglyLinkedList {
    // crate Node class which has data and address of next node
    class Node {
        int data;
        Node next;

        int index=-1;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    int size = 0;
    public void addNode (int data){
        //Create a new node
        Node newNode = new Node(data);
        // Increment size
        newNode.setIndex(size);
        size++;

        //Checks if the list is empty.
        if (head == null){
            //If list is empty, both head and tail will point to new node
            head = tail = newNode;

        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        // Starting position of the Node.
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
        }
        while(current != null) {
            System.out.println("Data in node :: " + current.data);
            current = current.next;
        }
    }

    public void removeNode(int remIndex){
        Node current = head;


        while (current != null){
            if(head.index == remIndex){
                head = head.next;
                size--;
                return;
            } else if(remIndex == current.getIndex() + 1){
                Node remNode = current.next;
                Node newNode = current.next.next;

                current.next = newNode;

                size--;
                return;

            }
            current = current.next;
        }
    }


}

public class TestLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNode(50);
        singlyLinkedList.addNode(60);
        singlyLinkedList.addNode(70);

        singlyLinkedList.display();

        singlyLinkedList.removeNode(5);
        System.out.println("------------After removing----------");

        singlyLinkedList.display();
    }
}
