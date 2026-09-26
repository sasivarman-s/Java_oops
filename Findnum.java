import java.util.Scanner;

public class Findnum {

    static String result(int mark){
        if(mark>=35){
            return "pass";
        }else{
            return "fail";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the mark: ");
        int mark = sc.nextInt();
        Findnum f1 = new Findnum();
        String found = f1.result(mark);
        System.out.println(found);
    }
}
