package _12_oops;

public class Fish implements Predator, Prey{

    @override
    public void hunt(){
        System.out.println("The fish is hunting");
    }

    @override
    public void flee(){
        System.out.println("The fish is running away");
    }
    
}
