package demoProblem6;

interface mech{
    public void engine();
    public void key();
}
abstract class truck implements mech{
    abstract public void run();
    abstract public void stop();

}
public class home extends truck{
    public void key()
    {
        System.out.println("Key found ...........");
    }
    public void engine()
    {
        System.out.println("Engine starting ............");
    }
    public void run()
    {
        System.out.println("tataTruck is running ..........");
    }
    public void stop()
    {
        System.out.println("tataTruck is stopping .........");
    }
}