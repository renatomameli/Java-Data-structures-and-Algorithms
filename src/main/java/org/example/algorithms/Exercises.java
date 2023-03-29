package org.example.algorithms;

import org.example.dataStructures.AdvancedNode;
import org.example.dataStructures.Node;

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

    public static int[][] rotateBy90Degree(int[][] matrix){
        for (int areaCount = 0; areaCount < matrix.length/2; areaCount++){
            int areaLength = matrix.length-areaCount*2;

            for(int column = 0; column<areaLength-1; column++){
                int counter = 0;
                int xOld = column+areaCount;
                int yOld = areaCount;
                int oldValue = matrix[yOld][xOld];
                int newValue;

                while (counter < 4){
                    int xNew = matrix.length-1-yOld;
                    int yNew = xOld;
                    newValue = matrix[yNew][xNew];
                    matrix[yNew][xNew] = oldValue;
                    oldValue = newValue;
                    xOld = xNew;
                    yOld = yNew;
                    counter++;
                }
            }
        }
        return matrix;
    }

    public static void zerofy(int[][] matrix){
        boolean rowHasZero = false;
        boolean columnHasZero = false;

        for (int i=0; i< matrix.length; i++){
            if (matrix[0][i] == 0){
                rowHasZero = true;
                break;
            }
        }

        for (int i=0; i< matrix.length; i++){
            if (matrix[i][0] == 0){
                columnHasZero = true;
                break;
            }
        }

        for (int i=1; i< matrix.length; i++){
            for (int j=1; j< matrix.length; j++){
                if (matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i=1; i< matrix.length; i++){
            if (matrix[0][i] == 0){
                for (int j=0; j< matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }

        for (int i=1; i< matrix.length; i++){
            if (matrix[i][0] == 0){
                for (int j=0; j< matrix.length; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        if (rowHasZero){
            for (int i=0; i< matrix.length; i++){
                matrix[0][i] = 0;
            }
        }

        if (columnHasZero){
            for (int i=0; i< matrix.length; i++){
                matrix[i][0] = 0;
            }
        }

    }

    public static boolean isRotation(String a, String b){
        if (a.length() != b.length()){
            return false;
        }

        char firstChar = a.charAt(0);
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<a.length(); i++){
            if (b.charAt(i)==firstChar){
                sb.append(b, i, a.length());
                sb.append(b, 0, i);
            }
            if (a.equals(sb.toString())){
                return true;
            }
        }
        return false;
    }

    public static void removeDuplicates (Node node){
        HashMap<Integer, Node> hashMap = new HashMap<>();
        hashMap.put(node.data, node);

        while (node.next!=null){
            Node foundNode = hashMap.get(node.next.data);
            if(foundNode!=null){

            }

        }
    }

    public static int findFromBehind (Node n, int number){
        int counter = 0;
        int indexFound = -1;

        while (n != null){
            if (n.data == number){
                indexFound = counter;
            }
            n = n.next;
            counter++;
        }

        if (indexFound >= 0){
            return counter-indexFound;
        }
        return -1;
    }

    public static int printKthToLast(Node n, int k){
        if (n == null){
            return 0;
        }

        int index = printKthToLast(n.next, k+1);
        if (index == k){
            System.out.println(k + "th to last node is " + n.data);
        }
        return index;
    }
}
