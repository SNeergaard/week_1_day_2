package com.example.homework_08_13;

public class multiplication_table {
    public class MulTableInJava {

    }

    public static void main(String args[]) {
        printTables();
    }

    public static void printTables() {
        int MulTable[][] = new int[10][10];
        for (int row = 1; row <= 10; row++){
            for (int col = 1; col <= 10; col++){
                int value= row*col;
                MulTable[row-1][col-1] = value;
                System.out.println(MulTable[row-1][col-1]);
            }
        }
    }
}


