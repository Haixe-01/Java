package _12_oops;

public class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showName(){
        System.out.println("Your name is: "+this.firstName+this.lastName);
    }
}
