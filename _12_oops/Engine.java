package _12_oops;

public class Engine {
    
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println(" The engine "+ this.type+ " has started");
    }
}
