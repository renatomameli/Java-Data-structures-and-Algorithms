package org.example;

import org.example.algorithms.Exercises;


public class Main {
    public static void main(String[] args) {
        String a = "abc";
        String b = "ad";

        boolean result = Exercises.haveNotMoreThanOneEdit(a,b);
        System.out.println(result);

    }
}