package StringPrograms;

public class reverse_words {
    public static void main(String[]args){
        String str="i am ironman";
        String[]words=str.split(" ");
        String rev="";
       // System.out.println(words.length);
        for(int i=0;i< words.length;i++){
            String word=words[i];
            String reverse="";

            for(int j=word.length()-1;j>=0;j--){
                reverse+=word.charAt(j);


            }
            System.out.println(reverse);
            }


        }



    }

