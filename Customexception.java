//in this program i creted a custom exception that handles when the user enter age below 18
import java.util.*;

public class Customexception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("enter your age to get into party: ");
            int age = sc.nextInt();
            if(age<18){
                throw new Notvalidage("Age should be 18 or above 18");
            }

            System.out.println("you are allowed to party!.....");
        }
        catch(Notvalidage e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println("Handled->"+e);
        }
        catch(ArithmeticException e){
            System.out.println("Handled->"+e);
        }
        finally{
            System.out.println("program ended");
        }

        sc.close();
    }
}

class Notvalidage extends Exception{
    Notvalidage(String s){
        super(s);
    }
}