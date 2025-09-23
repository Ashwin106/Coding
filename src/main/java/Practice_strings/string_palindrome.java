package Practice_strings;

import java.util.Scanner;

public class string_palindrome {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a string: ");
        String input=scanner.next();
        StringBuilder sb=new StringBuilder(input).reverse();
        String reverse=sb.toString();

        if (input.equals(reverse)) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }

}
