package Practice_strings;

public class remove_white_spaces {
    public static void main(String[]args){
        String input="I am batman";
        StringBuilder sb=new StringBuilder(input.length());
        String nospace="";
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(!Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
