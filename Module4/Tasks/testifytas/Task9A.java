package com.testifytas;

public class Task9A {
    public static void main(String[] args) {

        //Task 9: I have a list of numbers, 1-10, write a loop that prints odd if it is an odd number and a loop that prints even if it is an even number.

        for (int num = 1; num<= 10; num++)
        {

            if (num % 2 == 0) {

                System.out.println(num + " even.");

            } else {
                System.out.println(num + " odd.");
            }

        }






    }
}
