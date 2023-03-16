package org.example.dataStructures;

import java.util.Arrays;

public class CustomArrayList<T> {

    private Object[] list = new Object[1];
    private int lastInsertedIndex = 0;

    public CustomArrayList() {
        this.list = (T[]) new Object[1];
    }

    public void add(T element){
        int currentListSize = this.getList().length;
        if(this.getLastInsertedIndex() >= currentListSize){
            Object[] newArray = new Object[currentListSize*2];
            System.arraycopy(this.getList(), 0, newArray, 0, currentListSize);
            newArray[currentListSize] = element;
            this.setList(newArray);
        } else {
            this.list[lastInsertedIndex] = element;
        }
        this.increaseLastInsertedIndex();
    }

    private void increaseLastInsertedIndex(){
        this.setLastInsertedIndex(this.getLastInsertedIndex()+1);
    }

    private void setLastInsertedIndex(int lastInsertedIndex){
        this.lastInsertedIndex = lastInsertedIndex;
    }

    private int getLastInsertedIndex(){
        return this.lastInsertedIndex;
    }

    private Object[] getList(){
        return this.list;
    }

    private void setList(Object[] list){
        this.list = list;
    }

    public String toString(){
        return Arrays.toString(this.getList());
    }
}
