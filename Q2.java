import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int A = sc.nextInt();
        System.out.println("Enter B: ");
        int B = sc.nextInt();
        System.out.println("Enter C: ");
        int C = sc.nextInt();

        int D = A*B*C;
        int E = A+B+C;

        int Result = D/E;

        System.out.println("Result: "+ Result);
    }
}
