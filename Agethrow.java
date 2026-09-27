import java.util.Scanner;
import java.util.InputMismatchException;

public class Agethrow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if(age<=0){
                throw new ArithmeticException("age must starts from 1");
            }

            System.out.println("your age is: "+ age);
            
        }catch(InputMismatchException e){
            System.out.println("Handled->"+e);
        }
        catch(ArithmeticException e){
            System.out.println("Handled->"+e);
        }
        finally{
            System.out.println("program ended");
        }
    }
}
