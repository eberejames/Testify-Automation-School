package com.JavaChallenge;

import java.util.Arrays;

// Given a collection of 1 million integers, all ranging between1 to 9, sort them in Big O(n) time
public class Task8 {
    public static void main(String[] args) {
        int[] num = {7, 9, 4, 1, 6, 6, 5, 1, 9, 9, 7, 2, 2, 2, 1, 7, 9, 9};

        System.out.println("Actual array: " + Arrays.toString(num));

        countingSort(num, 1, 9);

        System.out.println("Expected array: " + Arrays.toString(num));
    }

    private static void countingSort(int[] arr, int min, int max) {
        int[] count = new int[max - min + 1];

        for (int num : arr) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            while (count[i - min] > 0) {
                arr[index++] = i;
                count[i - min]--;
            }
        }
    }
}

