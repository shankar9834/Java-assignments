public class prob5 {
    public static void main(String[] args) {

        try{
            System.out.println(5/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("finally executed as no error occured............");
        }
        try{
            int arr[]={2,5};
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
            finally{
                System.out.println("exeption not handled but still finally block executed ");
              //  throw new ArithmeticException();
            }
        

       
       

     
       
       
    }
}
