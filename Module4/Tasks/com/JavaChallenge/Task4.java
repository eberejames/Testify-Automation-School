package com.JavaChallenge;

// Write  a  Java code  to  check  for  the Prime  numbers between 1-100
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1-100 are:");

        for (int i = 2; i <= 100; i++) {
            if (primeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    private static boolean primeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


}


