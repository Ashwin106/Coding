package StringPrograms;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scanner.nextLine();
        String rev="";
        char ch;
        System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
    }
}
