import vehicle.vehicles;

class car extends vehicles{
    public int avg;
    public car(String n,String p,int pt,int av)
    {
        comp=n;
        eng=p;
        plateNum=pt;
        avg=av;
    }
    public void getCar()
    {
        System.out.println("Car Company : "+comp);
        System.out.println("Car engine : "+eng);
        System.out.println("Car plate number : "+plateNum);
        System.out.println("Car milage : "+avg);

    }
}
public class problem2{
    public static void main(String[] args) {
        
        car suv=new car("jaguar", "petrol", 2565, 16);
        suv.getCar();
    }
}