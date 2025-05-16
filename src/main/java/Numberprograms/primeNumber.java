package Numberprograms;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scanner.nextInt();
        boolean flag=false;
        if(number==0||number==1){
            flag=true;
        }
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
