package com;
class mobile{
    private int cost;
    private String camera;
    public String username;
    public mobile(int c,String c1,String u)
    {
        cost=c;
        camera=c1;
        username=u;
    }
    public void getInfo()
    {
        System.out.println("username : "+username);
        System.out.println("cost : "+cost );
        System.out.println("camera : "+camera);

    }

}
public class problem3 {
    public static void main(String[] args) {
        mobile samsung=new mobile(20000,"64px","carl");
        mobile oppo=new mobile(15000,"48px","lay");
        mobile apple=new mobile(60000,"56px","andrew");
        System.out.println("samsung mobile user");
             samsung.getInfo();
        System.out.println();
        System.out.println("oppo mobile user");
             oppo.getInfo();
        System.out.println();
        System.out.println("apple mobile user");
             apple.getInfo();
    }
}
