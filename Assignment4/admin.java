package employee;



public class admin{
    private class adm{
        public static void greet()
        {
            System.out.println("greetings form private class adm");
        }
    
    }
    
    protected class user{
        public static void greet()
        {
            System.out.println("greetings from user");
        }
    }
    
    public static void greeting()
    {
        adm.greet();
        user.greet();
    }
}
    