
/*problem statement
  Write a Java program to find the value of following variables:

z=8,
a= z++ + ++z,
b= z-- + --z
c= z++,
d=++z,
e=z--,
f=--z
 */
public class problbem6 {
    public static void main(String[] args) {
        int z=8;
        int a=z++ + ++z;
        int b=z-- + --z;
        int c=z++;
        int d=++z;
        int e=z--;
        int f=--z;
        System.out.println("z : "+z);
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);
        System.out.println("f : "+f);

    }
}
