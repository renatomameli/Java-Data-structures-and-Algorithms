package org.example.algorithms;

import java.util.Collections;
import java.util.List;

public class Search {

     /**
      * TODO: Use comparator
      * Assume that inputList is sorted
      * returns index of inputList
      * returns -1 if value was not found**/
    public static int binarySearch(List<Double> inputList, double inputNumber){
        int size = inputList.size();
        int index = size/2;

        double max = inputList.get(size-1);
        double min = inputList.get(0);

        int minIndex = 0;
        int maxIndex = size-1;

        while(max >= min){
            //This is a bit dirty
            if(index==0 || index==size){
                if (inputList.get(index) == inputNumber){
                    return index;
                } else {
                    return -1;
                }
            }
            if (inputList.get(index) < inputNumber){
                minIndex = index+1;
                min = inputList.get(minIndex);
                index = (maxIndex+minIndex+1)/2;

            }
            if (inputList.get(index) > inputNumber){
                maxIndex = index -1;
                max = inputList.get(maxIndex);
                index = (maxIndex-minIndex+1)/2;
            }
            if (inputList.get(index) == inputNumber){
                return index;
            }
        }

        return -1;
    }

    public static int binarySearch(List<Integer> list, int number){
        List<Double> doubleList = list.stream().map(num -> (double) num).toList();
        return binarySearch(doubleList, number);
    }

    public static int binarySearch(List<Character> list, Character character){
        List<Double> doubleList = list.stream().map(character1 -> (double) character1).toList();
        return binarySearch(doubleList, (double) character);
    }
}
