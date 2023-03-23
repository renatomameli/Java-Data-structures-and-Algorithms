package org.example;

import org.example.algorithms.Exercises;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[][] matrix = {  {0, 1, 2, 3, 10},
                            {3, 2, 1, 0, 11},
                            {3, 5, 6, 1, 12},
                            {3, 8, 3, 4, 15},
                            {9, 8, 5, 7, 90}};
        int l = matrix.length;

        Exercises.zerofy(matrix);
        System.out.println(Arrays.toString(matrix));

    }
}