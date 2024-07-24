
public class str1 {
    public static void main(String[] args) {
        String str="abhishek pandey";
        System.out.println(str.length());
        String st="abhishek";
        char ch=st.charAt(3);
        System.out.println(ch);
        System.out.println(st.indexOf('k'));
        String gtr="gorakhpur";
        System.out.println(str.compareTo(gtr));
        String str1="abhishek pandey";
        System.out.println(str1.contains("abh"));
        System.out.println(str1.startsWith("hi"));
        System.out.println(str1.endsWith("ey"));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        
    }
    
}