package com;
/*
problem statement
Write two Java programming on method overloading and constructor overloading in Java by varying the number of arguments and
changing the data types of the arguments of multiplication

 */
class multiply{
    private int a;
    private int b;
    private int c;
    private float a1;
    private float b1;
    private float c1;
    multiply(int as,int bs){
         a=as;
         b=bs;
        System.out.println("multiplication of integer numbers is "+ a*b);
    }
    multiply(int as,int bs,int cs)
    {
        a=as;
        b=bs;
        c=cs;
        System.out.println("multiplication of three integers is "+a*b*c);
    }
    multiply(float a11,float b11)
    {
        a1=a11;
        b1=b11;
        System.out.println("multiplication of floating numbers is "+ a1*b1);
    }
    multiply(float a11,float b11,float c11 )
    {
        a1=a11;
        b1=b11;
        c1=c11;
        System.out.println("multiplication of three floating numbers is "+ a1*b1*c1);
    }

}
public class problem7a {
    public static void main(String[] args) {
        System.out.println("constructor overloading ");
 multiply ms=new multiply(2,5);
 multiply ms2=new multiply(5,3,7);
        multiply mf=new multiply(1.2f,5.4f);
        multiply msf=new multiply(2.1f,2.36f,5.1f);

    }
}
