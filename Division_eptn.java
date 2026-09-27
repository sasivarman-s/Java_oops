import java.util.*;

public class Division_eptn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter numerator: ");
            int num = sc.nextInt();
            System.out.println("enter dinaminator: ");
            int den = sc.nextInt();

            if(den==0){
                throw new Zerodivisionerror("cannot divide a number by 0");
            }

            Divide d = new Divide();
            System.out.print("result is: ");
            System.out.println(d.result(num,den));
        }
        catch(InputMismatchException e){
            System.out.println("Handled->"+e);
        }
        catch(Exception e){
             System.out.println("Handled->"+e);
        }
        finally{
             System.out.println("program ended.");
        }

        
    }
}

class Divide{
    int result(int num,int den){
        int res = num/den;
        return res;
    }
}

class Zerodivisionerror extends Exception{
    Zerodivisionerror(String s){
        super(s);
    }
}
