package org.example;

import org.example.dataStructures.MyStack;


public class Main {
    public static void main(String[] args) throws EmptyStackException {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(4);
        stack.push(9);
        stack.push(6);
        stack.push(1);
        stack.push(10);
        stack.push(3);
        stack.push(0);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        int result = stack.getMin();
        System.out.println(result);


    }
}