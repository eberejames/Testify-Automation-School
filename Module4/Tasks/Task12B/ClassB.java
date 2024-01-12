package com.Task12B;


//This method can only be accessed within this class
public class ClassB {
    public static void main(String[] args) {
        ClassB myFood = new ClassB();
        myFood.method();

    }
    private void method (){
        System.out.println("can only be accessed within this class");
    }
}

