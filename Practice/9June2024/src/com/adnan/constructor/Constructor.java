package com.adnan.constructor;

public class Constructor {

	String name;
    int age;

    public Constructor(){       // constructor
        System.out.println("no arguments constructor");
    }

    public Constructor(String naam, int umar){
        System.out.println("parameterized constructor being called");

        this.name = naam;
        this.age = umar;
    }


    void printObject(){
        System.out.println(this.name + " , " + this.age);
    }


    public static void main(String[] args) {
        
    	Constructor dogObj1 = new Constructor();
        dogObj1.printObject();

        Constructor dogObj2 = new Constructor();
        dogObj2.printObject();

        Constructor dogObj3 = new Constructor("Scooby", 5);
        dogObj3.printObject();
    }
}
