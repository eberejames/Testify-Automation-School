package com.testifytas;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        // Invoke the method to verify visitors on slack
                verifyVisitor();
            }

            private static void verifyVisitor() {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Why are you here?");
                String userInput = scanner.nextLine();


                if (userInput.equalsIgnoreCase("Testify")) {
                    // Welcome message
                    System.out.println("Welcome to Testify Academy!");
                } else {
                    // Rejection message
                    System.out.println("Sorry, Access denied");
                }

                scanner.close();
            }
        }

