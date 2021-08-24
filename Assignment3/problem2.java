//package assignment3;

abstract class arithmetic{
    abstract public void addition(int a,int b);
    abstract public void substraction(int a,int b);
    abstract public void multiplication(int a,int b);
    abstract public void divide(int a,int b);

} 

class add extends arithmetic{
    public void addition(int a,int b)
    {
        System.out.println("Sum is : "+(a+b));
    }
    public void substraction(int a,int b)
    {
        System.out.println("substraction is : "+(a-b));
    }
    public void multiplication(int a,int b)
    {
          System.out.println("Multiplication is : "+ (a*b));
    }
    public void divide(int a,int b)
    {
        System.out.println("dividing a by b : "+(a/b));
    }
}
class div extends arithmetic{
    public void addition(int a,int b)
    {
        System.out.println("Sum is : "+(a+b));
    }
    public void substraction(int a,int b)
    {
        System.out.println("substraction is : "+(a-b));
    }
    public void multiplication(int a,int b)
    {
          System.out.println("Multiplication is : "+ (a*b));
    }
    public void divide(int a,int b)
    {
        System.out.println("dividing a by b : "+(a/b));
    }
}
class sub extends arithmetic{
    public void addition(int a,int b)
    {
        System.out.println("Sum is : "+(a+b));
    }
    public void substraction(int a,int b)
    {
        System.out.println("substraction is : "+(a-b));
    }
    public void multiplication(int a,int b)
    {
          System.out.println("Multiplication is : "+ (a*b));
    }
    public void divide(int a,int b)
    {
        System.out.println("dividing a by b : "+(a/b));
    }
}
class mult extends arithmetic{
    public void addition(int a,int b)
    {
        System.out.println("Sum is : "+(a+b));
    }
    public void substraction(int a,int b)
    {
        System.out.println("substraction is : "+(a-b));
    }
    public void multiplication(int a,int b)
    {
          System.out.println("Multiplication is : "+ (a*b));
    }
    public void divide(int a,int b)
    {
        System.out.println("dividing  : "+(a/b));
    }
}



public class problem2 {
   public static void main(String[] args) {
           add ad=new add();
           ad.addition(5, 7);
           System.out.println();
           sub sb=new sub();
           ad.substraction(7, 2);
           System.out.println();
           mult mt=new mult();
           mt.multiplication(2, 9);
           System.out.println();
           div d=new div();
           d.divide(10, 2);
           System.out.println();
   } 
}
