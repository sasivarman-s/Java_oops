import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiondemo{
    public static void main(String[] args) {
        int error = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number 1: ");
            int a = sc.nextInt();
            System.out.println("Enter number 2: ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch(InputMismatchException e){
            System.out.println("Handled: "+e);
            error = error + 1;
        }
        catch(ArithmeticException e){
            System.out.println("Handled: "+e);
            error = error + 1;
        }
        finally{
            System.out.println(error+ " errors found");
            System.out.println("im finally");
        }
    }
}