package com;
/*
problem statement
Write two Java programming on method overloading and constructor overloading in Java by varying the number of arguments and
changing the data types of the arguments of multiplication

 */
class mult{
    private int a;
    private int b;
    private int c;
    private float a1;
    private float b1;
    private float c1;

    public void multi(int a11,int b11)
    {a=a11;
        b=b11;
        System.out.println("multiplication of integer numbers is "+ a*b);
    }
    public void multi(int a11,int b11,int c11)
    {a=a11;
        b=b11;
        c=c11;
        System.out.println("multiplication of three integer numbers is "+ a*b*c);
    }
    public void multi(float a11,float b11)
    {a1=a11;
        b1=b11;
        System.out.println("multiplication of floating numbers is "+ a1*b1);
    }
    public void multi(float a11,float b11,float c11)
    {a1=a11;
        b1=b11;
        c1=c11;
        System.out.println("multiplication of three floating numbers is "+ a1*b1*c1);
    }
}
public class problem7b {
    public static void main(String[] args) {
        System.out.println("method overloading");
        mult m1=new mult();
        m1.multi(2,5);
        m1.multi(4,7,8);
        m1.multi(2.1f,5.7f);
        m1.multi(3.7f,6.4f,9.8f);

    }
}
