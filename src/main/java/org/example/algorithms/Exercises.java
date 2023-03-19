package org.example.algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class Exercises {

    public static boolean isUnique(String s){
        while (s.length()>1){
            String letter = s.substring(0,1);
            s=s.substring(1);
            if (s.contains(letter)){
                return false;
            }
        }
        return true;
    }

    public static boolean isUnique2(String s){
        HashMap<Character, Boolean> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Boolean aBoolean = map.get(s.charAt(i));
            if(aBoolean!=null){
                return false;
            }
            map.put(s.charAt(i), true);
        }
        return true;
    }

    public static boolean isPermutation(String a, String b){
        if (a.length()!=b.length()){
            return false;
        }

        char[] charArrayA = a.toCharArray();
        Arrays.sort(charArrayA);

        char[] charArrayB = b.toCharArray();
        Arrays.sort(charArrayB);

        return Arrays.equals(charArrayA, charArrayB);
    }

    public static String urlify(char[] chars, int size){
        final String REPLACEMENT = "%20";
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<size; i++){
            String currentChar = String.valueOf(chars[i]);
            if (currentChar.equals(" ")){
                sb.append(REPLACEMENT);
            } else {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
