package org.example;

import org.example.algorithms.Exercises;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String a = "waterbottle";
        String b = "rrbottlwat";

        boolean res = Exercises.isRotation(a,b);
        System.out.println(res);

    }
}