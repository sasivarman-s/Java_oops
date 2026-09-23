public class Moverload {
        static void add(int a,int b){
            System.out.println(a+b);
        }

        static void add(int a,int b,int c){
            System.out.println(a+b+c);
        }

        public static void main(String[] args){
            Moverload m1 = new Moverload();
            m1.add(10,20);
            m1.add(10,20,30);
        }
}
