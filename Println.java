public class Println {
    public static int age = 20;
    public static  String name = "sasivarman";
    public static  double salary = 25000.50;
    public static  boolean Is_single = true;

    public static void main(String[] args) {
        System.out.println("All the details of user: ");
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        if( Is_single){
            System.out.println("Status: single");
        }else{
            System.out.println("Status: married");
        }
    }
}
