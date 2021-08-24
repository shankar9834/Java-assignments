/*
4.	Write a recursive definition in java that converts binary number to decimal number. 
*/
//package assignment3
import java.util.Scanner;
public class problem4{
    static void binaryToDci(String s)
    {
        double k=s.length();double ans=0;
        k--;
        for(int i=0;i<s.length();i++)
        {double a=s.charAt(i)-'0';
        if(a>0){
            ans=ans+Math.pow(2, k);
           
        } k--;
          
        }
        System.out.println((int)ans);
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the string that you have to convert it into decimal");
        String s=new String();
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        binaryToDci(s);



    }
}