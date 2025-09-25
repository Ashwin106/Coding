package Practice_strings;

public class swap_strings {
    public static void main(String[]args){
        String a="hello";
        String b="worlds";

        a=a+b;
        b=a.substring(0,a.length()-b.length());

        a=a.substring(b.length());

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
