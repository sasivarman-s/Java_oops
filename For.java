import java.util.Scanner;
public class For {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Starts from?: ");
        int st = sc.nextInt();
        System.out.print("To end?: ");
        int end = sc.nextInt();

        for(int start=st;start<=end;start=start+1){
            System.out.println(start);
        }
    }
}
