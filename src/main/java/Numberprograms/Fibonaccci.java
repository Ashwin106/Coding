package Numberprograms;

import java.util.Scanner;

public class Fibonaccci {
    public static void main(String[]args){
        int first=0,second=1,next;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number: ");
        int number=scanner.nextInt();
        for(int i=0;i<=number;i++){
            System.out.println(first +" ");
            next=second+first;
            first=second;
            second=next;
        }
    }
}
