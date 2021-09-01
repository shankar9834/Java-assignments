package employee;
public class school{
    public String nme;
    public String city;
    public void setSchool(String n,String a)
    {
        nme=n;
        city=a;
    }
    public void getSchool()
    {
        System.out.println("School name : "+nme);
        System.out.println("School area : "+city);
    }

}