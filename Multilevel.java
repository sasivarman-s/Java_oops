public class Multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.render();
        obj.display();
        obj.show();
    }
}

class A{
    void show(){
        System.out.println("this is from class A");
    }
}

class B extends A{
    void display(){
        System.out.println("this is from class B");
    }
}

class C extends B{
    void render(){
        System.out.println("this is from class C");
    }
}