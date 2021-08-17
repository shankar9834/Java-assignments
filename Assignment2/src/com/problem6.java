package com;

public class problem6 {
    public static void main(String[] args) {
        System.out.println("general formula for pentagonal number is p(n)=n*(n-1)+n*(n+1)/2");
        System.out.println("displaying first 50 pentagonal numbers");
        for(int i=1;i<=50;i++)
        {
            System.out.println(i*(i-1)+(i*(i+1))/2);

        }
    }
}
