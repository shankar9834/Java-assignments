import MCA.student;
public class problem1{
    public static void main(String[] args) {
        student s1=new student("shankar",80,90,95);
        int total=s1.chem+s1.math+s1.ph;
        float avg=((float)s1.chem+(float)s1.math+(float)s1.ph)/3;
        s1.getStudent();
  System.out.println("Total marks :"+total);
  System.out.println("Percentage :"+avg);

    }
}