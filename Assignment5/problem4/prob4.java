public class prob4{
    public static void  first()
    {
          System.out.println("first method .........");
          second();
    }
    public static void  second()
    {
          System.out.println("second method .........");
          third();
    }
    public static void  third()
    {
          System.out.println("third method .........");
          fourth();
    }
    public static void  fourth()
    {
          System.out.println("fourth method .........");
          int b=0;
          System.out.println(12/b);
    }

    public static void main(String[] args) {
        
        try{
            first();
        }
        catch(Exception e)
        {
            System.out.println();
            System.out.println("error occured");

            System.out.println(e);
        }
    }
}