package com.testifytas;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        //Task 8: Build a Simple interest calculator. Write a program to ask the user for the necessary field you need in calculating the simple interest and then communicate the simple interest back to the user is a good sentence
        //Formular to calculate simple interest = S.I. = (P × R × T)/100, where P = Principal, R = Rate of Interest in % per annum, and T = Time



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount50 ");
        float principal = scanner.nextFloat();

        System.out.print("What is the interest rate in percentage? ");
        float rateOfInterest = scanner.nextFloat();

        System.out.print("What is the duration in years? ");
        float durationInYrs = scanner.nextFloat();

        float simpleInterest = (principal *  rateOfInterest * durationInYrs) / 100;

        System.out.println(simpleInterest);






    }
}
