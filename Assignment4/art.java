package demo;


public class art{
    private class group{

        static void greet()
        {
            System.out.println("group is waving at you !!");
        }
       
    }
    public void say()
    {
        System.out.println("private class is not accesssed outside of package so accesed here!!");
        group.greet();
    }

}