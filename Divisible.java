import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        System.out.println("Total numbers which are divisible by 3 and 5 till 100: ");
        for(int i=1;i<=100;i++){
            if ((i%3==0)&&(i%5==0)) {
                System.out.println(i);
                count = count + 1;
            }
        }

        System.out.println("count of total words: "+ count);
    }
}