import java.io.IOException;

import citizens.citizen;

class myExp extends Exception{
    public String  toString(){
        return "not elidible for vaccination";
    }
}
public class vaccine extends citizen {
     
     
    public vaccine(String n,int a,int b,int c)
    {
        
        name=n;
        adhhar=a;
        mb=b;
        age=c;


    }
    public void verifyAge()
    {  try{
        if(age<18){
            throw new myExp();
        }
        else{
            System.out.println("age verified .........");
        }
    }
    catch(Exception e)
    {
        System.out.println(e.toString());
       
    }
       
    }


    public static void main(String[] args) {
        
            citizen c=new vaccine("shanks", 25, 52, 12);
            c.verifyAge();
             citizen x=new vaccine("vk", 54, 25, 19);
             x.verifyAge();
        
       
    }

}
