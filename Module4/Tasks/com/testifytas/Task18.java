package com.testifytas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("what is your age? ");
            int age = scanner.nextInt();

            System.out.print("I am " + age + " yrs old");

        } catch (InputMismatchException datatypeException) {
            System.out.println("Error! try again");
            System.out.println("datatypeException");

        }

    }
}