/* 
Daemon thread in Java is a service provider thread that provides services to the user thread. 
Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this 
thread automatically.
 */
import java.lang.*;

public class Thread1 extends Thread{

   public Thread1(String threadName)
   {
         super(threadName);

   }
   public void run()
   {
        for(int i=0;i<5;i++)
        {
         System.out.println("Thread1 is running "+Thread.currentThread().getName()+" "+i);
         System.out.println("Thread1 is running "+Thread.currentThread()+" "+i);
        }
   }
}