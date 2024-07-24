import java.util.*;
public class andoperator {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("the number first");
        int a=sc.nextInt();
        System.out.println("second number");
        int b=sc.nextInt();
        System.out.println("enter the number third");
        int c=sc.nextInt();
        System.out.println(a<b&&a<c);
        System.out.println(a<b&a<c);
        System.out.println(a<b&&a<c);
        System.out.println(a<b&&a++<c);
        System.out.println(a<b&&a<++c);
        System.out.println(a>b||a<c);
        System.out.println(a<b|a<c);
        System.out.println(a<b);
        System.out.println(b);
        System.out.println(a<c);
        System.out.println(a);
    }
}
        


