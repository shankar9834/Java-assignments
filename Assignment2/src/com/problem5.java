package com;
/*
problem5 statement
Write a Java program to calculate the area of circle, pentagon, triangle, square and rectangle using switch statement.
Remember at any time users/programmer can see the area of any one of the geometrical shape.
 */
import java.util.Scanner;
import java.lang.Math;
public class problem5 {
    public static void main(String[] args) {
        System.out.println("circle : 1");
        System.out.println("pentagon : 2");
        System.out.println("triangle : 3");
        System.out.println("square : 4");
        System.out.println("rectangle : 5");
        System.out.println("select one of above options ,area of which you want to calculate ");
        int a;
        Scanner it=new Scanner(System.in);
        a=it.nextInt();
        switch (a){
            case 1:
                System.out.println("Enter radius of circle");
                double r;
                r=it.nextInt();
                System.out.println("Area of circle is : "+ 3.14*r*r);
                break;

            case 2:
                System.out.println("Enter side of pentagon");
                double s ;
                s=it.nextInt();
                double ans=(Math.sqrt(5*(5+2*Math.sqrt(5)))*a*a)/4;
                System.out.println("Area of pentagon is : "+ ans);
                break;

             case 3:
                 System.out.println("Enter base and height of triangle");
                 int b,h;
                 b=it.nextInt();
                 h=it.nextInt();

                 System.out.println("Area of triangle is : "+ 0.5*(double)b*h);
                 break;

             case 4:
                 System.out.println("Enter side of square");
                 int s1;
                 s1=it.nextInt();


                 System.out.println("Area of square is : "+ s1*s1);
                 break;

            case 5:
                System.out.println("Enter sides of rectangle");
                int a1,a2;

                a1=it.nextInt();
                a2=it.nextInt();
                System.out.println("Area of rectangle is : "+ a1*a2);
                break;


        }

    }
}
