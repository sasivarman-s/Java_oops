import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter mark: ");
        double mark = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the department");
        String dept = sc.nextLine();

        System.out.println("My name is: "+name);
        System.out.println("my score is: "+ mark/10 +"/10");
        System.out.println("my department: "+ dept);

    }
}
