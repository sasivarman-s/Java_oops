import java.util.Scanner;
public class Returnfunction {
    static String getname(String name){
        String res = "Your name is "+ name;
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();

        String strfn = getname(name);
        System.out.println(strfn);
    }
}
