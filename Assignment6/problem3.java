package com;

public class problem3 implements Runnable {
 public void run()
 {
     System.out.println(Thread.currentThread().getName()+" is running .........");
 }
    public static void main(String[] args) {

     problem3 t1=new problem3();
     Thread saniya=new Thread(t1);
     problem3 t2=new problem3();
     Thread maria=new Thread(t2);
     problem3 t3=new problem3();
     Thread serena=new Thread(t3);
    saniya.run();
    maria.run();
    serena.run();
        System.out.println();
    saniya.start();
    maria.start();
    serena.start();
        try{
            saniya.sleep(100);
            maria.sleep(200);
            serena.sleep(300);
            saniya.join();
            maria.join();
            serena.join();
        }
        catch (Exception e) {
            System.out.println("Error occured (sleep)");

        }
        saniya.setPriority(Thread.NORM_PRIORITY);
        maria.setPriority(Thread.NORM_PRIORITY);
        serena.setPriority(Thread.NORM_PRIORITY);
        System.out.println();
        saniya.suspend();
        System.out.println("saniya thread suspended");
        saniya.resume();
        System.out.println("saniya thread resumed ");

        maria.suspend();
        System.out.println("maria thread suspended");
        maria.resume();
        System.out.println("maria thread resumed ");

        serena.suspend();
        System.out.println("serena thread suspended");
        serena.resume();
        System.out.println("serena thread resumed ");
        System.out.println();
        System.out.println("Explaination : ");
        System.out.println("When we directly call run method then the main thread is called and no new thread is processed");
        System.out.println("while when we call start method then the new thread seperately executes");
    }
}
