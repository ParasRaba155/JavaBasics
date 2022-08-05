package ShapePkg;
import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l,b;
        System.out.print("Enter length and breath of the rectangle respectively : ");
        l = sc.nextInt();
        b = sc.nextInt();
        Shape r = new Rectange(l, b);
        System.out.println(r);



        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.hashCode() == s2.hashCode());
        sc.close();

    }
}
