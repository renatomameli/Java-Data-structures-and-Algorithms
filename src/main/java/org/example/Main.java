package org.example;

import org.example.algorithms.Exercises;
import org.example.dataStructures.Node;

import java.util.Arrays;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Node n = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);

        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        Node a = new Node(11);
        Node a1 = new Node(12);
        Node a2 = new Node(13);

        a.next = a1;
        a1.next = a2;
        a2.next = n2;

        int length = a.length();
        System.out.println(length);

        Node result = Exercises.intersection2(a,n);
        System.out.println(result);


    }
}