package _12_oops;

public class Rectangle extends Shape{

    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area(){
        return length*breadth;
    }
}
