

public class problem5_b {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 9;
        int d = 11;
        int k1=Math.min(a,b);
        int l1=Math.min(c,d);
        int k = Math.max(a, b);
        int l = Math.max(c, d);
        int max=k>l?k:l;
        int min=k1<l1?k1:l1;
        System.out.println("solved problem 5 using ternery operator");
        System.out.println("max : "+max);
        System.out.println("min : "+min);

    }


}
