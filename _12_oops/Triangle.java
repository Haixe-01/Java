package _12_oops;

public class Triangle extends Shape{

    int height;
    int base;

    Triangle(int height, int base){
        this.height = height;
        this.base = base;
    }

    @Override
    double area(){
        return 0.5* height *base;
    }
    
}
