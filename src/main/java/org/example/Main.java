package org.example;

import org.example.algorithms.Exercises;
import org.example.dataStructures.Node;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Node n = new Node(10);
        Node n1 = new Node(6);
        Node n2 = new Node(4);
        Node n3 = new Node(3);
        Node n4 = new Node(1);
        Node n5 = new Node(2);
        Node n6 = new Node(5);

        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        System.out.println(n);

        Exercises.partition(n, 5);
        System.out.println(n);


    }
}