package Practice_strings;

public class string_reverse {
    public static void main(String[]args){
        String input="ashwin";
        String rev="";
        char ch;
        for(int i=0;i<input.length();i++){
            ch=input.charAt(i);
            rev=ch+rev;

        }
        System.out.println(rev);
    }

}
