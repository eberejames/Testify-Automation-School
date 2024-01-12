package com.JavaChallenge;

// Reverse "TestifyAutomation" using recursion in Java
public class Task7 {
    public static void main(String[] args) {
        String originalWord = "TestifyAutomation";

        String reversedWord = reverseString(originalWord);

        System.out.println("Original String is: " + originalWord);
        System.out.println("Reversed String is: " + reversedWord);
    }

    // Function to reverse a string using recursion
    private static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            // Concatenate the last character with the reversed substring of the rest of the string
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }
    }
}

