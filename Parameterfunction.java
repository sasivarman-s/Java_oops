public class Parameterfunction {
    static void add(int a,int b){
        System.out.println(a+b);
    }

    static void sub(int a,int b){
        System.out.println(a-b);
    }

    static void mul(int a,int b){
        System.out.println(a*b);
    }

    static void div(int a,int b){
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;

        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);
    }
}
