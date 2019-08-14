package com.example.homework_08_13;

import java.util.Scanner;

public class palindrone {

    public static void main(String[] args) {
        String w1 = "racecar";
        String w2 = "slowplane";


        System.out.println(checkPalindrome(w1));
        System.out.println(checkPalindrome(w2));

    }


    public static boolean checkPalindrome(String word){
    for (int c =0; c < word.length(); c++){
        int k = word.length()-c-1;
        if( word.charAt(c) != word.charAt(k)) {
            return false;
        }
        }

        return true;
    }
}
