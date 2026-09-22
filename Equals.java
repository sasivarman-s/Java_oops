class Equals{
    public static void main(String[] args) {
        String name1 = "sasivarman";
        String name2 = "sasivarman";

        String val1 = new String("apple");
        String val2 = new String("apple ");

        if(name1.equals(name2)){
            System.out.println("values compared and true");
        }else{
            System.out.println("values compared and not true");
        }

        if(name1 == name2){
            System.out.println("address compared and true");
        }else{
            System.out.println("address compared and not true");
        }

        if(val1.equals(val2)){
            System.out.println("values compared and true");
        }else{
            System.out.println("values compared and not true");
        }

        if(val1 == val2){
            System.out.println("address compared and true");
        }else{
            System.out.println("address compared and not true");
        }
    }
}