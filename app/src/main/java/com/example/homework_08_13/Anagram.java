package com.example.homework_08_13;

import java.util.Arrays;
import java.util.List;

public class Anagram {

    public static void main(String[]args){
        String wordA = "neergaard";
        String wordB = "draegraen";

        boolean b = checkAnagrams(wordA,wordB);

        System.out.println(b);
    }
    public static boolean checkAnagrams(String word1, String word2) {
        //implement our logic
        if(word1.length()!=word2.length()){
            return false;
        }
        char[] charr1 = word1.toCharArray();
        char[] charr2 = word2.toCharArray();
        Arrays.parallelSort(charr1);
        Arrays.parallelSort(charr2);

        System.out.println(charr1);
        System.out.println(charr2);
        return Arrays.equals(charr1,charr2);


    }
}
