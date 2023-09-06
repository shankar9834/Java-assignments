package com;

public class problem1 {
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+ " is running ");

        try{
            Thread.sleep(500);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {

           Thread sachin=new Thread();
           Thread virat=new Thread();
           Thread sehwag=new Thread();

        System.out.println("before starting Thread execution :");

        System.out.println("sachin : "+sachin.getState());
        System.out.println("virat : "+virat.getState());
        System.out.println("sehwag : "+sehwag.getState());
        sachin.start();
        System.out.println("state after starting sachin thread : "+sachin.getState());
        System.out.println("after starting sachin thread virat state: "+virat.getState());
        System.out.println("after starting sachin thread sehwag: "+sehwag.getState());
      virat.start();
        System.out.println("state after starting virat thread : "+virat.getState());
      sehwag.start();
        System.out.println("after starting all threads");

        System.out.println("state after starting sehwag thread : "+sehwag.getState());

        try{
            sachin.join();
            virat.join();
        }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("sachin thread : "+sachin.getState());
        System.out.println("sehwag thread : "+sehwag.getState());
    }
}
