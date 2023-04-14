package org.example.dataStructures;


public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String toString(){
        Node n = this;

        if (getStartLoop(n) != null){
            return "Circular linked list: " + n.data;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n.data);
        while (n.next!=null){
            sb.append(", ").append(n.next.data);
            n=n.next;
        }
        return sb.toString();
    }

    public int length(){
        int length = 0;
        Node n = this;
        while (n != null){
            length++;
            n = n.next;
        }
        return length;
    }

    public static Node getStartLoop(Node n){
        Node pointer = null;

        if (n == null || n.next == null){
            return null;
        }

        pointer = n.next;
        Node storage = null;
        int counter = 0;

        while (pointer != null){
            if (pointer == n){
                if (counter % 2 == 0){
                    return storage;
                } else {
                    return n;
                }
            }
            storage = n;
            n = n.next;
            pointer = pointer.next;

            if (pointer != null){
                pointer = pointer.next;
            }
            counter ++;
        }

        return null;
    }
}

