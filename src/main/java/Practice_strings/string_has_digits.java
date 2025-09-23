package Practice_strings;

import java.util.Scanner;

public class string_has_digits {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a string: ");
        String input=scanner.next();
        boolean digits=false;
        for(char c:input.toCharArray()){
            if(Character.isDigit(c)){
                digits=true;
            }

        }
        if(digits){
            System.out.println("digit is present");
        }
        else {
            System.out.println("no digits");
        }

    }
}
