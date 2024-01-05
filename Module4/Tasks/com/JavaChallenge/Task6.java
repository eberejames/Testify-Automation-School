package com.JavaChallenge;


// Using  Java  Code,  check  for  Anagrams  in  these  strings:"Despite commuting at the peek hour, she was able to keep to time"
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task6 {

    public static void main(String[] args) {
        String text = "Despite commuting at the peek hour, she was able to keep to time ";

        String[] words = text.split("\\s+");

        Map<String, StringBuilder> anagramMap = new HashMap<>();

        for (String word : words) {
            // Remove non-alphabetic characters and convert to lowercase for case-insensitive comparison
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Sort the characters in the word
            char[] charArray = cleanedWord.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Add the sorted word to the map
            if (anagramMap.containsKey(sortedWord)) {
                anagramMap.get(sortedWord).append(" ").append(word);
            } else {
                anagramMap.put(sortedWord, new StringBuilder(word));
            }
        }

        // Print the groups of anagrams
        for (StringBuilder group : anagramMap.values()) {
            System.out.println("Anagram Group: " + group);
        }
    }
}

