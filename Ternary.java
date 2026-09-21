import java.util.Scanner;
public class Ternary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers contuniously: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        String result = n1>n2?"1st number is greater":"2nd number is greater";
        System.out.print(result);
    }
}
