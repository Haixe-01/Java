package _12_oops;

 //THREAD BY EXTENDING THREAD CLASS

 class A extends Thread{
    public void run(){
        System.out.println("hello");
        }
    }

    class B extends Thread{
        public void run(){
            System.out.println("hi");
        }
    }

    class C extends Thread{
        public void run(){
            System.out.println("bye");
        }
    }

    public class Use{
        public static void main(){
            A a = new A();
            B b = new B();
            C c = new C();
            a.start();
            b.start();
            c.start();
        }
    }
