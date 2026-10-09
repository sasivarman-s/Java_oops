class Genric{
    public static void main(String[] args){
        Some<String> s = new Some<>("sasivarman\n");
        System.out.print(s.getsomething());
        Some<Integer> v = new Some<>(18);
        System.out.print(v.getsomething());
        Some<String> n = new Some<>("\nMSEC");
        System.out.print(n.getsomething());
    }
}

class Some<T>{
    T something;
    
    Some(T something){
        this.something = something;
    }
    
    T getsomething(){
        return something;
    }
}
