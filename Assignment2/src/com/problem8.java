package com;
/*
8.	Write a Java program to print the Fibonacci series of the number up to 100.
 */
public class problem8 {
    public static void main(String[] args) {
        System.out.println("displaying fibonacci series upto 100");
         long []fib=new  long[101];
        fib[0]=1;
        fib[1]=1;
        System.out.println(fib[0]);
        System.out.println(fib[1]);
        for(int i=2;i<=10;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];

            System.out.println(fib[i]);
        }

    }
}
