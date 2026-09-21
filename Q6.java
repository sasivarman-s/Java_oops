import java.util.Scanner;
public  class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(salary>=20000 || age<=25){
            System.out.print("Enter required loan amount: ");
            int Lamt = sc.nextInt();

            if(Lamt<=50000){
                System.out.print("elegible for loan");
            }else{
                System.out.print("Maximum loan amount is 50,000");
            }

        }else{
            System.out.print("you are not elegible for loan");
        }
    }
}