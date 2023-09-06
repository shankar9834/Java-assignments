import java.util.Scanner;

public class P2 {
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static void main(String[] args) {
        
        System.out.println(TEXT_RED+"program 2"+TEXT_RESET);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
    }
    
}
