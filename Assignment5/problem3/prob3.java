 import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;



public class prob3 {
   
     public static void  checkedMeth(int a){
        try{
            if(a==1)
        {
        throw new ArithmeticException();
        }
        else if(a==2)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
    
    }
    catch(Exception e)
    {
        System.out.println("Checked exeption (dummy)");
        System.out.println(e);
    }

            
    } 
    public static void uncheckedMeth(int a)
    {
        try{
            if(a==1)
            {
                throw new IOException();
            }
            else if(a==2)
            {
                throw new SQLException();
            }
            else if(a==3)
            {
                throw new FileNotFoundException();
            }
        }
        catch(Exception e)
        {
            System.out.println("Unchecked exeption");
            System.out.println(e);
        }
    }
 
    public static void main(String[] args) {
      checkedMeth(1);
      System.out.println();
        checkedMeth(2); System.out.println();
        checkedMeth(3);  System.out.println();
        uncheckedMeth(1); System.out.println();
        uncheckedMeth(2); System.out.println();
        uncheckedMeth(3);   System.out.println();
      
    }
    
}
 