import java.util.*;
public class Threads{
    public static void main(String[] args){
        A a1 = new A();
        B b1 = new B();
        a1.start();
        b1.start();

    }
}

class A extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world...");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("bye world...");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}