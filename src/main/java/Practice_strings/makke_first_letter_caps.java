package Practice_strings;

public class makke_first_letter_caps {
    public static void main(String[]args){
        String input="hello world";
        String[]words=input.split(" ");
        StringBuilder sb=new StringBuilder();

        for(String word:words){
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");

        }
        System.out.println(sb);
    }
}
