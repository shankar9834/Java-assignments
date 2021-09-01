
/* problem statement :
  Write a Java code for designing a simple calculator with five arithmetic operators
  (addition, subtraction, multiplication, division, and modulo) and three logical operators (and, or, and not).
 */
import java.util.Scanner;
public class problem1 {


    public static void main(String[] args) {


        System.out.println("add      : 1");

        System.out.println("subtract : 2");
        System.out.println("multiply : 3");
        System.out.println("divide   : 4");
        System.out.println("modulo   : 5");
        System.out.println("and      : 6");
        System.out.println("or       : 7");
        System.out.println("not      : 8");
        System.out.println("select any one operation from above ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n<=5) {
          System.out.println("Enter two numbers on which operation has to perform");
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = 0;
          switch (n)
          {
              case 1 :
                  c=a+b;
                  break;

              case 2:
                  c=a-b;
                  break;

              case 3:
                  c=a*b;
                  break;
              case 4:
                  c=a/b;
                  break;
              case 5:
                  c=c%b;
                  break;


          }
          System.out.println(c);
      }
      else if(n>=6){
          System.out.println("Enter two boolean values");
          boolean a1=sc.nextBoolean();
          boolean b1=sc.nextBoolean();
          switch (n)
          {
              case 6:
                  System.out.println(a1&&b1);
                  break;
              case 7:
                  System.out.println(a1||b1);
                  break;
              case 8:
                  System.out.println(!a1 );
                  System.out.println(!b1);
          }
      }


    }
}
