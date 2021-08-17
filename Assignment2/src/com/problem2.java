package com;
class admin{
    int age;
    String name;
    public void setName(int a,String s)
    {
        age=a;
        name=s;
    }
}

class customer{
    int mbNum=123456789;
    String ans="catch me ,if you can :)";
    public void getName()
    {
        System.out.println("MbNUm : "+mbNum);
        System.out.println("Msg : "+ans);
    }
}
public class problem2 {
    public static void main(String[] args) {
        System.out.println("setter method invoked");
        admin you=new admin();
        you.setName(20,"shankar");
        System.out.println("getter method invoked for diff class");
       customer rush=new customer();
       rush.getName();

    }
}
