//threads share the same memory space

public class ThreadTest {

    public static void main(String[] args) {
        
        System.out.println("inside main thread");
        Thread t1=new Thread1("first thread");
        t1.start();

        Thread t2=new Thread(new Thread2(),"second thread");
        t2.start();

        System.out.println("exiting main thread");
    }
    
}
