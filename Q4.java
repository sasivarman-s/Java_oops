import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = sc.nextInt();

        if(score<50){
            System.out.println("you need to improve");
        }
        else if (score>=50) {
            if(score>=70){
                System.out.println("Excellent perfomance!");
            }else{
                System.out.println("good job");
            }
        }
    }
}
