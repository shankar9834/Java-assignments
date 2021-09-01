
import java.util.Scanner;
public class problem3_b {
    public static void main(String[] args) {
        System.out.println("enter radius of circle");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        box b = new box(r);
        System.out.println("enter sides of rectangle ");
        int s1= sc.nextInt();
        int s2= sc.nextInt();
        box x=new box(s1,s2);


    }
}

