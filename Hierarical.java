public class Hierarical {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.sound();
        Puppy p = new Puppy();
        p.weep();
        p.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("it is an animal also can sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dogs can bark");
    }
}

class Puppy extends Animal{
    void weep(){
        System.out.println("puppies can weep");
    }
}