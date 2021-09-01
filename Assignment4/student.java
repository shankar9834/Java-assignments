package MCA;

public class student {
    String name;
    
    public int ph;
    public int math;
    public int chem;
    public student(String name,int ph,int math,int chem)
    {
        this.name=name;
        this.ph=ph;
        this.math=math;
        this.chem=chem;
    }
    public void getStudent()
    {
       System.out.println(name);
       System.out.println("physics : "+ph);
       System.out.println("Maths  : "+math);
       System.out.println("chemistry : "+chem);
       
    }
}
