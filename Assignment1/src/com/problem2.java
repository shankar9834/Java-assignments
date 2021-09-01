

/* problem statement
  Write three parameterized constructors for adding two operands, three operands and four operands,
  respectively in the Addition class and called them with from a main class with three objects.
*/

class Addition{
    public int a;
    public int b;
    public int c;
    public int d;
   public Addition(int a1,int b1)
   {a=a1;b=b1;
       System.out.println("adding two operands : " + a+b);
   }
  public Addition(int a1,int b1,int c1)
   {
       a=a1;b=b1;c=c1;
       System.out.println("adding three operands : " + a+b+c);
   }
  public Addition(int a1,int b1,int c1,int d1)
   {
       a=a1;b=b1;c=c1;d=d1;
       System.out.println("adding four operands : "+ a+b+c+d);
   }
}
public class problem2 {

    public static void main(String[] args) {
        Addition add2=new Addition(5,7);
        Addition add3=new Addition(8,9,2);
        Addition add4=new Addition(6,3,1,4);


    }
}
