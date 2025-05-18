package _12_oops;


class MyRunnable implements Runnable{
public void run(){
    System.out.println("hello");
}
}
public class Mutli {
    public static void main(String[] args){
        MyRunnable myRunnable =new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start();
    }
    
}
