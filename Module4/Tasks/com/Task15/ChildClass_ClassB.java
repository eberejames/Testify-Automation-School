package com.Task15;

public class ChildClass_ClassB extends ParentClass_ClassA{
    public static void main(String[] args) {
        ParentClass_ClassA proteinFood = new ParentClass_ClassA();
        ParentClass_ClassA carbohydrateFood = new ParentClass_ClassA();
        ParentClass_ClassA fatFood = new ParentClass_ClassA();
        ChildClass_ClassB vitaminsFood = new ChildClass_ClassB();
        ChildClass_ClassB waterFood = new ChildClass_ClassB();
        proteinFood.fish();
        carbohydrateFood.yam();
        fatFood.sunFlower();
        vitaminsFood.vitD();
        waterFood.springWater();


    }

    public void vitD () {
        System.out.println("Vitamins");
    }

    public void springWater (){
        System.out.println("Water");

    }
}




