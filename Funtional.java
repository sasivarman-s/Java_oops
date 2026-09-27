public class Funtional {
   public static void main(String[] args) {
       A a = new A() {
        public void show(){
            System.out.println("showed");
        }
       };

       a.show();
   }
}

interface A{
    void show();
}
