import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int A = sc.nextInt();

        if ((A%3==0)&&(A%5==0)) {
            System.out.println("number is divisible by 3 and 5");
        }
        else{
            System.out.println("Not divisible by 3 and 5");
        }
    }
}