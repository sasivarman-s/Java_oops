import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int tot = m1+m2+m3+m4+m5;
        int max = tot/5;

        if(max<35){
            System.out.println("have to attend additional class");
        }
        else{
            System.out.println("chill and free");
        }

    }
}
