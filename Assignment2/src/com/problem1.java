package com;

public class problem1 {
static boolean isPrime(int a)
{
    for(int i=2;i*i<=a;i++)
    {
        if(a%i==0){
            return false;
        }

    }
    return true;
}
    public static void main(String[] args) {
int[] arr=new int[100];int j=1;arr[0]=2;
	for(int i=3;i<=100;i++)
    {
         if(isPrime(i))
         {
             arr[j]=i;j++;
         }
    }
	for(int i=0;arr[i]!=0;i++)
    {
        if(arr[i+1]!=0){
        System.out.println(arr[i]+" "+arr[i+1]);
        }
    }

    }
}
