package org.example;

import org.example.algorithms.Exercises;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[][] matrix = {  {0, 1, 2, 3},
                            {3, 2, 1, 0},
                            {3, 5, 6, 1},
                            {3, 8, 3, 4}  };;
        int l = matrix.length;

        int[][] result = Exercises.rotateBy90Degree(matrix);
        System.out.println(Arrays.toString(result));

    }
}