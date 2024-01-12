package com.Task16B;

public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        ChildClass family = new ChildClass();
        family.africa( "Ebere");
        family.num(5);

    }

        @Override
        public void africa (String name) {
            System.out.println(name + " is a girl");
        }


        @Override
        public void num(int number) {
            System.out.println(number * 3);
        }


}

