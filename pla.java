public class pla{
    public static void main(String[] args) {
      Guitar g = new Guitar();
      g.play();
      Piano p = new Piano();
      p.play();  
    }
}

interface Music {
    void play();
}

class Guitar implements Music{
    public void play(){
        System.out.println("guitar is playable");
    }
}

class Piano implements Music{
    public void play(){
        System.out.println("piano is playable");
    }
}
