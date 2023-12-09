package com.testifytas;

public class Task4 {
    public static void main(String[] args) {


        //Task 4: find the area of a circle with radius on 12.7m. Print out your result with the unit of measurement which is metres
        //Area =pi(3.14) * R*R (12.7*12.7)

        double radius = 12.7;
       double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area+ " metres.");



    }
}
