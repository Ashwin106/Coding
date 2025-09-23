package Ashwin_coding_practice;

public class Palindrome {
    public static void main(String[]args){
        String input="madam";
        String rev="";
        char ch;
        for(int i=0;i<input.length();i++){
            ch=input.charAt(i);
            rev=ch+rev;

        }
        if(rev.equals(input)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
