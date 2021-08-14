
/*
Write the Java programs to find the maximum and minimum number among four numbers using
if-else statement and Ternary operator separately.
 */
public class problem5_a {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 9;
        int d = 11;
        int k1=Math.min(a,b);
        int l1=Math.min(c,d);
        int k = Math.max(a, b);
        int l = Math.max(c, d);
        if(k>l){
            System.out.println("max :"+k);
        }
        else if(l>=k){
            System.out.println("max :"+l);
        }
        if(k1>=l1)
        {
            System.out.println("min : "+l1);
        }
        else{
            System.out.println("min : "+k1);
        }


    }
}