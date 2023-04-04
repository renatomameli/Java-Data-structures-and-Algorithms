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
}

