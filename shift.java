import java.util.*;
public class shift {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("the number first");
        int a=sc.nextInt();
        System.out.println("second number");
        int b=sc.nextInt();
        System.out.println(a<<b);
        System.out.println(b<<a);
        System.out.println(a>>b);
        System.out.println(b>>a);

    }
    
}
