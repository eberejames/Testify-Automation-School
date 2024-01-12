package com.Task14;

public class ClassB {
    public static void main(String[] args) {
        SquareShape_ClassA blueSquare = new SquareShape_ClassA();
        blueSquare.setShapeBreadth(12);
        int breath =blueSquare.getShapeBreadth();

        blueSquare.setShapeLength (13);
        int length = blueSquare.getShapeLength();


        int area =  length * breath;               //formula for calculating area of square: length*breath
        System.out.println(area);
        System.out.println("The area of the square length:" + length + " and breath:" + breath + " is " + area);






    }


    }