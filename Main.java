//single inheritance......

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.show();
    }
}


class A{
    void show(){
        System.out.println(" showed from class A");
    }
}

class B extends A{
    void display(){
        System.out.println("displayed from class B");
    }
}
