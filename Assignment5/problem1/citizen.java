package citizens;
public abstract class citizen{

    public String name;
    public int adhhar;
    public int mb;
    public int age;
    public citizen()
    {

    };
    public citizen(String s,int a,int m,int c)
    {
          name=s;
          adhhar=a;
          mb=m;
          age=c;

    }  ;

    public abstract void verifyAge();

}
