package org.example;

import org.example.algorithms.Exercises;
import org.example.algorithms.Search;
import org.example.algorithms.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        CustomStringBuilder customStringBuilder = new CustomStringBuilder();
//        customStringBuilder.append("Dies ist ein test");
//        customStringBuilder.append(" und der Test geht weiter");
//
//        System.out.println(customStringBuilder.getStrings());
//
//        String[] array = new String[5];
//        System.out.println(Arrays.toString(array));
//
//        CustomArrayList<String> customArrayList = new CustomArrayList<>();
//        customArrayList.add("Test");
//        customArrayList.add("2");
//        customArrayList.add("3");
//        customArrayList.add("4");
//        customArrayList.add("5");
//        System.out.println(customArrayList);

//        CustomHashMap<String, Integer> customHashMap = new CustomHashMap<>(9);
//        customHashMap.put("MyKey", 3);
//        customHashMap.put("Test", 4);
//        customHashMap.put("Test", 4);
//
//        Integer myKey = null;
//        Integer myKey2 = null;
//        if (customHashMap.get("MyKey").isPresent()){
//            myKey = customHashMap.get("MyKey").get();
//        }
//        if (customHashMap.get("Test").isPresent()){
//            myKey2 = customHashMap.get("Test").get();
//        }
//
//        System.out.println(myKey);
//        System.out.println(myKey2);
//        String f = "abcde";
//        System.out.println(f.substring(1,f.length()-1));
//
//        String s = "ghqdawsed";
//        boolean isUnique2 = isUnique2(s);
//        System.out.println(isUnique2 + " " + s);
//
//        String str = "dfij;";
//        int v = 'b';


//        Integer[] inputArray = new Integer[1000000];
//        for(int i=0; i<inputArray.length; i++){
//            inputArray[i] = (int)(Math.random() * ((100000) + 1));
//        }
//
//        Sort.mergeSort(inputArray);
//
//        List<Integer> list = Arrays.asList(inputArray);
//        int index = Search.binarySearch(list, 100000);
//        System.out.println(index);
//        if(index!=-1){
//            System.out.println(list.get(index));
//        }

        String a = "sdukfg  hj";
        String b = "dskufjgh";

        char[] charArray = a.toCharArray();
        String result = Exercises.urlify(charArray, 10);


        System.out.println(result);




    }


}