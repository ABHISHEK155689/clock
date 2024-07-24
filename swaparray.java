public class swaparray {
    static void swap(int a, int b){
        System.out.println("orignal swap array");
        System.out.println("a"+a);
        System.out.println("b"+b);
        a=b;
        b=a;
        System.out.println("ornngal after swap");
        System.out.println("a"+a);
        System.out.println("b"+b);
        public static void main(String[] args){
            int a=9;
            int b=3;
            swap(a,b);
        }
    }
}
