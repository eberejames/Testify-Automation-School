package com.JavaChallenge;

// Reverse the position of words in "I am the best AutomationTester" using recursion
public class Task2 {
    public static void main(String[] args) {
        String words = "I am the best Automation Tester";

        System.out.println("Original words: " + words);
        String reversePositionOfWords = reverseWords(words);
        System.out.println("Reversed words: " + reversePositionOfWords);
    }

    // Function to reverse the position of words in a sentence using recursion
    private static String reverseWords(String words) {
        if (words.isEmpty()) {
            return words;
        } else {
            // Find the index of the first space
            int spaceIndex = words.indexOf(' ');

            if (spaceIndex == -1) {
                // If there are no more spaces, return the remaining sentence
                return words;
            } else {
                // Recursively reverse the rest of the sentence and append the current word
                return reverseWords(words.substring(spaceIndex + 1)) + " " + words.substring(0, spaceIndex);
            }
        }
    }

}

