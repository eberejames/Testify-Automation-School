package com.Task12A;

public class ClassB {
    //Method "privateAccessor" cannot be accessed outside this class
    public static void main(String[] args) {
        ClassB negAccess = new ClassB();
        negAccess.privateAccessor();

    }

    private void privateAccessor() {
        System.out.println("can be accessed in public");
    }

}
