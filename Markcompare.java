import java.util.Scanner;
public class Markcompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ogpassmark = 35;
        System.out.println("Minimum 35 marks required to pass.");
        System.out.println("Enter the mark: ");
        int usermark = sc.nextInt();

        if(usermark >= ogpassmark){
            System.out.println("you are passed");
        }else{
            System.out.println("oops!..you are failed");
        }
    }
}
