package com.Task15;

public class ChildClass_ClassB extends ParentClass_ClassA{
    public static void main(String[] args) {
        ChildClass_ClassB proteinFood = new ChildClass_ClassB();
//        ParentClass_ClassA carbohydrateFood = new ParentClass_ClassA();
//        ParentClass_ClassA fatFood = new ParentClass_ClassA();
//        ChildClass_ClassB vitaminsFood = new ChildClass_ClassB();
//        ChildClass_ClassB waterFood = new ChildClass_ClassB();
        proteinFood.fish();
        proteinFood.yam();
     proteinFood.sunFlower();
        proteinFood.vitD();
       proteinFood.springWater();


    }

    public void vitD () {
        System.out.println("Vitamins");
    }

    public void springWater ()
    {
        System.out.println("Water");

    }
}




