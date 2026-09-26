public class Super {
    public static void main(String[] args) {
        Employee e = new Employee("sasivarman");
        e.display();
    }
    
}

class Person{
    String name;

    Person(String name){
        this.name = name;
    }

    void display(){
        System.out.println("employee name is "+ name);
    }
}

class Employee extends Person{
   
    Employee(String name) {
        super(name);
    }
}