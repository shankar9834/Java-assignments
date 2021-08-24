/*
5.	Write a specific scenario and then write a java program on that scenario like 
Question 1 and 2 that contains both method overloading and method overriding in the same program. 
*/


//package assignment3
class messenger{
    String msg;
    String userName;
    void sendMsg(String name)
    {
        System.out.println("This is the default msg");
        System.out.println("user : "+name);
    }
    void sendMsg(String name,String ms)
    {
        System.out.println(ms);
        System.out.println("user : "+name);
    }

}



class advertise extends messenger{
    void sendMsg(String company)
    {
        System.out.println("we are here to help you , thanks for choosing us !");
        System.out.println(company);
        
    }

    void sendMsg(String company ,String adv)
    {
        System.out.println(adv);
        System.out.println(company);
    }
}
public class problem5{
    public static void main(String[] args) {
        
           messenger ms=new messenger();
           ms.sendMsg("carl");
           System.out.println();
           ms.sendMsg("joe", "happy journey!");
           System.out.println();
           advertise commercial=new advertise();
           commercial.sendMsg("jio");
           System.out.println();
           commercial.sendMsg("jio", "jio ji bhar k :) ");

    }
} 
