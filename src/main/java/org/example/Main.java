package org.example;

import org.example.algorithms.Exercises;
import org.example.dataStructures.Node;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Node n = new Node(1);
        Node n1 = new Node(5);
        Node n2 = new Node(21);
        Node n3 = new Node(43);
        Node n4 = new Node(99);
        Node n5 = new Node(100);

        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        int result = Exercises.findFromBehind(n, 99);
        System.out.println(result);


    }
}