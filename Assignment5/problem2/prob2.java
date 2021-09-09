import arithmetic.sum;

import java.io.Console;

import arithmetic.min;

public class prob2 {
    public static void main(String[] args) {
        
        int arr[]={5,4,2,6,8};
        sum s1=new sum();
        int a1=s1.add(arr);
        min n1=new min();
        int a2=n1.small(arr);
        try{
            System.out.println(a1/a2);
            System.out.print("No error occured ");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
