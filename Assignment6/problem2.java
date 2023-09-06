


class threads extends Thread{

    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "  is running............. ");
    

    }
}


public class problem2{

     public static void main(String[] args) {
        
        threads saniya =new threads();
        threads maria =new threads();
        threads serena =new threads();
        saniya.run();
        maria.run();
        serena.run();
        System.out.println();
        saniya.start();
        maria.start();
        serena.start();
        saniya.setName("n1");
        maria.setName("n2");
        serena.setName("n3");
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
        System.out.println();
         System.out.println("priority of saniya thread is "+ saniya.getPriority());
         System.out.println("priority of maria thread is "+ maria.getPriority());
         System.out.println("priority of serena thread is "+ serena.getPriority());
         System.out.println();
         
                 
    }
}