package Ashwin_coding_practice;

public class String_reverse {
    public static void main(String[]args){
        String word="ashwin";
        char ch;
        String rev="";
        for(int i=0;i<word.length();i++){
            ch=word.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
    }

}
