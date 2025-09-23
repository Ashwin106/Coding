package Ashwin_coding_practice;

public class words_string_reverse {
    public static void main(String[]args){
        String input="captain america";
        String[]words=input.split(" ");

        for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev="";

        for(int j=word.length()-1;j>=0;j--){
         rev+=word.charAt(j);
        }
            System.out.print(rev + " ");
        }

    }
}
