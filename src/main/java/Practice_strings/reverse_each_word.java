package Practice_strings;

public class reverse_each_word {
    public static void main(String[]args){
        String input="captain america";
        String[]words=input.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String reverese="";

            for(int j=word.length()-1;j>=0;j--){
                reverese+=word.charAt(j);
            }
            System.out.print(reverese +" ");
        }
    }
}
