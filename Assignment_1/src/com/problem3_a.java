
/*
Write a Java program to find the volume of three different types of Boxes while taking height,
width, and depth as inputs. Write two separate programs using the help of methods and parameterized constructors.
Similarly, write the Java programs to find the area of a circle and rectangle.
 */

import java.util.Scanner;

class box{
    public int height;
    public int depth;
    public int lengt;
    box(int a,int b,int c)
    {
        height=b;

        depth=c;
        lengt=a;
        System.out.println("volume of box is : "+ (a*b*c));

    }
    box(int a,int b)
    {
        height=b;
        lengt=a;
        System.out.println("area of rectangle is "+(a*b));
    }
    box(int a)
    {
        System.out.println("area of circle is : "+3.14*a*a);
    }
}
public class problem3_a {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<3){

            System.out.println("Enter dimensions of box "+i);
            int l,b,h;
            System.out.println("Enter length ");
            l= sc.nextInt();
            System.out.println("Enter breadth ");
            b= sc.nextInt();
            System.out.println("Enter height ");
            h= sc.nextInt();
            box b1=new box(l,b,h);

            i++;
        }


    }
}
