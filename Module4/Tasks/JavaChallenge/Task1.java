package com.JavaChallenge;

// Write  Java  code  to  check  if  racecar  and  10801  is  a palindromes.
public class Task1 {
    public static void main(String[] args) {
        String str1 = "racecar";
        String num2 = "10801";

        if (isPalindrome(str1)) {
            System.out.println(str1 + " :a palindrome.");
        } else {
            System.out.println(str1 + " :not a palindrome.");
        }

        if (isPalindrome(num2)) {
            System.out.println(num2 + "  :a palindrome.");
        } else {
            System.out.println(num2 + " :not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {

        String remStr = str.replaceAll("\\s", "").toLowerCase();        //To remove spaces and convert to lowercase for case-insensitive comparison

        //String remStr = str1;
        int length = remStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (remStr.charAt(i) != remStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}








