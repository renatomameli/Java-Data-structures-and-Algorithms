package org.example.algorithms;

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
}
