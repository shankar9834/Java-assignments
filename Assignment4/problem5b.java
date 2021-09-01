import demo.art;
import demo.bike;
import demo.games;

public class problem5b {
    public static void main(String[] args) {
        System.out.println("Using import concepts");
        games g1=new games();
        g1.run();
        art a1=new art();
        a1.say();
        bike b1=new bike();
        b1.run();

    }
}
