public class Lambda {
    public static void main(String[] args) {
        A a = ()->{System.out.println("showed by lambda function");};
        a.show();
    }
}

interface A{
    void show();
}
