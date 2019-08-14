package com.example.homework_08_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDuplicates {

    public static void main(String[] args) {

        String[] colors = new String[]{"red", "brown", "yellow", "red", "brown", "blue", "purple", "blue", "green", "orange"};

        findDuplicates(Arrays.asList(colors));
    }

    public static void findDuplicates(List<String> strings) {

        String[] stringsarr = (String[]) strings.toArray();

        //  String[] colors = new String[]{"red", "brown", "yellow", "red", "brown", "blue", "purple", "blue", "green", "orange"};
        String[] duplicates = new String[stringsarr.length / 2];
        int k = 0;
        for (int i = 0; i < stringsarr.length; i++) {
            for (int j = i + 1; j < stringsarr.length; j++) {
                if (stringsarr[i].equals(stringsarr[j])) {
                    duplicates[k++] = stringsarr[i];
                }
            }
        }

        System.out.println(Arrays.toString(duplicates));
    }
}
