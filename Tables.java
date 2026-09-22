import java.util.Scanner;

public class Tables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The tables will be print from 1 to 10.");
        System.out.print("Enter what table you want: ");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(i+"x"+n+"="+i*n);
        }

    }
}
