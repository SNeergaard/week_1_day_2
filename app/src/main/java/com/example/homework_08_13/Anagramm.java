package com.example.homework_08_13;

import java.util.Arrays;

public class Anagramm {
    public void main(String[]args){
        String wordA = "neergaard";
        String wordB = "draegraen";

        checkAnagrams(wordA,wordB);

    }
    public boolean checkAnagrams(String word1, String word2) {
        //implement our logic
        if(word1.length()!=word2.length()){
            return false;
        }
        char[] charr1 = word1.toCharArray();
        char[] charr2 = word2.toCharArray();
        Arrays.parallelSort(charr1);
        Arrays.parallelSort(charr2);


        return false;

    }

}
