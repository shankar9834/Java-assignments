import employee.teacher;
import employee.school;
import employee.staff;
import employee.inter;
import employee.admin;
public class problem3{
    public static void main(String[] args) {
        teacher t=new teacher();
        t.setTeacher("shankar", 20);
        t.getTeacher();
         staff s=new staff();
        s.setStaff("john", 45);
        s.getStaff();
        school s1=new school();
        s1.setSchool("yjkm", "pune");
        s1.getSchool();
        
        admin.greeting();
      inter.fox.greet();
      inter.tiger.greet();
      inter.tom.greet();
 
    }
}