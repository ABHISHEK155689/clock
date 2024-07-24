import java.util.Scanner;
public class arithmatics1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        double num1=sc.nextDouble();
        System.out.println("enter the number");
        double num2=sc.nextDouble();
        double sum=num1+num2;
        double sub=num1-num2;
        double div=num1/num2;
        double mul=num1*num2;
        double mod=num1%num2;
        double sqr=num1+num2*num1/num2;
        System.out.println("result="+sum);
        System.out.println("result="+sub);
        System.out.println("result="+div);
        System.out.println("result="+mul);
        System.out.println("result="+mod);
        System.out.println("result="+sqr);
    }
    
}
