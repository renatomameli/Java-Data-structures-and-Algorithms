package org.example.dataStructures;

import org.example.EmptyStackException;

import java.util.Stack;

public class MyStack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;
        private StackNode<T> minUnder;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;
    private StackNode<T> min;

    public T pop() throws EmptyStackException {
        if (top == null) {
            throw new EmptyStackException();
        }
        StackNode<T> item = this.top;
        top = top.next;

        if (item == min) {
            this.min = this.top.minUnder;
        }

        return item.data;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;

        StackNode<T> oldMin = this.min;
        if (this.top.next == null) {
            this.min = t;
        } else {
            if (this.min != null && (int) t.data < (int) this.min.data) {
                this.min = t;
            }
            this.top.minUnder = oldMin;
        }
    }

    public T getMin() throws EmptyStackException {
        if (this.min != null) {
            return this.min.data;
        }

        throw new EmptyStackException();

    }
}
