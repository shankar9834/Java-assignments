//package assignment3;

/* question -
3.Write a specific scenario and then write a java program on that scenario like Question 1 and 2
 that represent multiple inheritance can possible to implement using interface. Similarly, write a specific 
 scenario and then write a java program on that scenario like Question 1 and 2 that represent interface extends
  another interface instead of implements. (Do not use the examples which have been discussed in the lectures). 
*/
/*
scenario 1-
create a events interface and players interface . create a  cityfest class implemnting both the above interfaces
(showing multiple inheritance).

scenario 2-
interface school extending interface higherSchool 

*/





interface Events{
    
    public void indoorEvents();
    public void outdoorEvents();
    public void starter();
    
}

interface players{
    public void numPlay(int n);
    public void city(String ct);
}

class cityFest implements Events,players{
    
    public void starter()
    {
        System.out.println("Event starting in few seconds ,be ready ..............!");
    }
    public void city(String ct)
    {
        System.out.println("hosting city is : "+ct);
    }
    public void numPlay(int n)
    {
        System.out.println("number of players taking part in diff events are : "+n);
    }
    @Override
    public void indoorEvents() {
        System.out.println("indoor events starting from today");
        System.out.println();
    }
    public void outdoorEvents()
    {
        System.out.println("outdoor events starting from tommorow");
        System.out.println();
    }
    
    
}

interface school{
    public void printSchoolName(String s);
    public void schoolTime(String start,String end);
    public void numStudent(int num);
    public void numTeacher(int num);
    


}

interface higherSchool extends school{
    public void printUniversityName(String s);
}

class university implements higherSchool{
    @Override
    public void printUniversityName(String s) {
        System.out.println("university name : "+s);
    }
    public void printSchoolName(String s)
    {
        System.out.println("school name : "+s);
    }
    public void schoolTime(String start,String end){
        System.out.println("school timing "+start+" to "+end );
    }
    public void numStudent(int num) {
        System.out.println("number of students are : "+num);
        
    }
    public void numTeacher(int num)
    {
        System.out.println("Number of tachers are : "+num);
    }

}



public class problem3 {
    public static void main(String[] args) {
        cityFest puneFest=new cityFest();
        puneFest.city("pune");
        puneFest.starter();
        puneFest.numPlay(560);
        puneFest.indoorEvents();
        puneFest.outdoorEvents();

        System.out.println();
        university sppu=new university();
        sppu.printUniversityName("pune university");
        sppu.printSchoolName("chatrapati shivaji maharaj international school");
        sppu.schoolTime("9am", "4pm");
        sppu.numStudent(700);
        sppu.numTeacher(60);

    }
    
}
