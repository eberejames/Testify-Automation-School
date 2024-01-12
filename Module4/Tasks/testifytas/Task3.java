package com.testifytas;

public class Task3 {
    public static void main(String[] args) {


        //Task 3: Create a variable and store your age in it. concatenate your age with a string and print it out on the console using the two methods of concatenation you were taught

        // Method 1
        int myAge = 215;
        String name ="My name is ebere. I am ";
        String newString = name + myAge;
        System.out.println(newString + " yrs old.");


        //Method 2
        name.concat(myAge+ " yrs old.");
        System.out.println(name.concat(myAge+ " yrs old."));

    }
}
