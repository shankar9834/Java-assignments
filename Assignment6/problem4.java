package com;

public class problem4 extends Thread{

    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Thread name : "+Thread.currentThread().getName());
            System.out.println("Daemon : "+ Thread.currentThread().isDaemon());
            System.out.println("daemon thread ");

        }
        else{
            System.out.println("Thread name : "+Thread.currentThread().getName());
            System.out.println("Daemon : "+ Thread.currentThread().isDaemon());

        }

    }
    public static void main(String[] args) {

        problem4 p1=new problem4();
        problem4 p2=new problem4();
        problem4 p3=new problem4();

        p1.start();
        p2.setDaemon(true);
        p2.start();

        p3.start();
        System.out.println("when user thread is no longer serving the exception should be handled");
        System.out.println("justifies : ");
        problem4 p5=new problem4();
        p5.start();
        try{
            p5.setDaemon(true);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Deamon thread are threads whose sole purpose is to serve other threads when it is no longer anyone it dies");
        System.out.println();
    }
}
