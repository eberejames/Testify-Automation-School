package com.Task13;

public class ClassB {
    public static void main(String[] args) {
        ClassA aboutName = new ClassA("Ebere");      //object of constructor 1
        aboutName.myDetails();
    }

    public static void Age(String[] args) {
        ClassA  aboutAge = new ClassA("Ebere", 100);        //object of constructor 2
        aboutAge.myDetails();
    }

    public static void Woman(String[] args) {
        ClassA  aboutMe = new ClassA("Ebere", 100, true);       //object of constructor 3
        aboutMe.myDetails();
    }
}
