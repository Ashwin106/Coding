package Numberprograms;

import java.util.Scanner;

public class ReverseNumner {
    public static void main(String[]args){
        int number,rev=0,rem;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number : ");
        number=scanner.nextInt();
        while(number>0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;

        }
        System.out.println("Reversed number: "+rev);
    }
}
