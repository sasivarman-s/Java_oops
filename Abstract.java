public class Abstract {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.fruitname();
        a1.display();
        System.out.println("-----------------------------------------");
        Orange o1 = new Orange();
        o1.fruitname();
        o1.display();
    }
}

abstract class Fruit{
    abstract void fruitname();

    void display(){
        System.out.println("this is implemented from abstract class Fruit...");
    }
}

class Apple extends Fruit{
    void fruitname(){
        System.out.println("this fruit is apple!");
    }
}

class Orange extends Fruit{
    void fruitname(){
        System.out.println("this fruit is orange!");
    }
}