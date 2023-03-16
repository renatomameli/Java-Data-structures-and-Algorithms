package org.example.dataStructures;

import java.util.ArrayList;

public class CustomStringBuilder {

    private final ArrayList<String> strings = new ArrayList<>();

    public void append(String s) {
        this.strings.add(s);
    }

    public ArrayList<String> getStrings(){
        return this.strings;
    }

    public String toString(){
        String result = "";
        for (String s : this.getStrings()){
            result += s;
        }
        return result;
    }
}
