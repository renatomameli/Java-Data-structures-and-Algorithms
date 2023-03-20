package org.example.algorithms;

import java.util.Arrays;
import java.util.BitSet;
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

    public static boolean isPermutationOfPalindrome(String s){
        s = s.toLowerCase();
        int[] amountOfChars = new int[26];

        for(int i=0; i<s.length(); i++){
            amountOfChars[s.charAt(i)-97]++;
        }

        int amountOffOddChars = 0;

        for (int i=0; i<amountOfChars.length; i++){
            if (amountOfChars[i] % 2 != 0){
                amountOffOddChars++;
            }

            if(amountOffOddChars > 1){
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutationOfPalindrome2(String s){
        s = s.toLowerCase();
        BitSet bitSet = new BitSet('z' - 'a');

        for (char character : s.toCharArray()){
            bitSet.flip(character - 'a');
        }

        return bitSet.cardinality() < 2;
    }

    public static boolean haveNotMoreThanOneEdit(String a, String b){
        int lengthA = a.length();
        int lengthB = b.length();
        int diffLength = Math.abs(lengthA-lengthB);

        if (diffLength > 1){
            return false;
        }

        if (a.equals(b)){
            return true;
        }

        for (int i=0; i<lengthA && i<lengthB; i++){
            char charA = a.charAt(i);
            char charB = b.charAt(i);

            if(charA!=charB){
                return i==lengthA-1                                                   // No more chars
                        || a.substring(i+1,lengthA).equals(b.substring(i+1, lengthB)) // Rest is equal
                        || a.substring(i+1, lengthA).equals(b.substring(i, lengthB))  // Diff was only added char in a
                        || a.substring(i, lengthA).equals(b.substring(i+1, lengthB)); // Diff was only added char in b
            }
        }
        return true;
    }

    public static String compress(String s){
        StringBuilder sB = new StringBuilder();
        char currentChar = s.charAt(0);
        int counter = 1;

        for (int i=1; i<s.length(); i++){
            if (s.charAt(i) == currentChar){
                counter++;
            } else {
                sB.append(counter).append((currentChar));
                counter = 1;
                currentChar = s.charAt(i);
            }
        }
        sB.append(counter).append(currentChar);

        String result = sB.toString();

        if(result.length() < s.length()){
            return result;
        }

        return s;
    }
}
