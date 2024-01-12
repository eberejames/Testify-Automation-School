package com.Task13;

public class ClassA {
    String name;
    int age;
    boolean status;

    public ClassA (String fName){    //constructor 1
        name =fName;
    }
    public ClassA (String fName, int myAge) {       //constructor 2
        age = myAge;
    }
    public ClassA (String fName, int myAge, boolean cStatus) {      //constructor 3
        status = cStatus;
    }
    public void myDetails (){           //Method defined
        System.out.println();

    }
}
