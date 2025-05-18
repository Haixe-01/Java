package _12_oops;

public abstract class Shape {

    abstract double area(); // ABSTRACT CLASS - MUST BE IMPLREMENTED BY CHILDREN

    void display(){ //CONCRETE CLASS - INHERETED BY CHILDREN
        System.out.println("This is a shape");
    }


    
}
