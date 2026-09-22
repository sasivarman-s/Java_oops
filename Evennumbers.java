import java.util.Scanner;
public class Evennumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numbers starts from 1");
        System.out.println("Enter the ending point: ");
        int evencount = 0;
        int end  = sc.nextInt();
        System.out.println("the even numbers are: ");

        for(int i=1;i<=end;i=i+1){
            if(i%2==0){
                System.out.println(i);
                evencount = evencount+1;
            }
        }
        System.out.println("Total even numbers count: "+ evencount);
    }
}
