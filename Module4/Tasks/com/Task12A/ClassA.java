package com.Task12A;

public class ClassA {
    public static void main(String[] args) {
        ClassA access = new ClassA();
        access.publicAccessor();

    }

    public void publicAccessor() {
        System.out.println("can be accessed in public");
    }
}