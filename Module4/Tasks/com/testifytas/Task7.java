package com.testifytas;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        //Task 7: create a two dimensional array with 4 rows and 3 columns. Fill only the first column with any fruits of ur choice

        String [] [] doubleArray = new String[4][3];
        doubleArray [0] [0] = "mango";
        doubleArray [1][0]= "pear";
        doubleArray [2] [0]= "orange";
        doubleArray [3] [0]= "paw-paw";
        System.out.println(Arrays.deepToString(doubleArray));


    }
}
