package Numberprograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[]args){
        int arm=0,number,a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=scanner.nextInt();
        b=number;
        while(number>0){
            a=number%10;
            number=number/10;
            arm=arm+a*a*a;
        }
        if(arm==b){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }

    }
}
