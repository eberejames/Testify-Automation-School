package com.JavaChallenge;

// Find two numbers of which the product is maximum in an array
public class Task3 {
    public static void main(String[] args) {
        int[] numArray = {4, 12, 43, 9, 8, 101, 51};

        Pair outcome = findMaxProductPair(numArray);

        if (outcome != null) {
            System.out.println(" The Two numbers with maximum product is: " + outcome.num1 + " & " + outcome.num2);
            System.out.println("The Maximum product is: " + (long) outcome.num1 * outcome.num2);
        } else {
            System.out.println("Array does not have two numbers with maximum product.");
        }
    }

    private static class Pair {
        int num1;
        int num2;

        Pair(int first, int second) {
            this.num1 = first;
            this.num2 = second;
        }
    }

    private static Pair findMaxProductPair(int[] numArray) {
        if (numArray == null || numArray.length < 2) {
            return null;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : numArray) {
            if (num > max1) {
               max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Check if the product of two positive numbers is greater or the product of two negative numbers is greater
        return (long) max1 * max2 > (long) min1 * min2 ? new Pair(max1, max2) : new Pair(min1, min2);
    }
}

