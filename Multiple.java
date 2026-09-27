public class Multiple {
    public static void main(String[] args) {
        Granding g =new Granding();
        g.show();
    }
}

interface playable{
    void show();
}

interface Printable{
    void show();
}

class Granding implements playable,Printable{
    public void show(){
        System.out.println("multiple inheritance implemented by interface");
    }
}
