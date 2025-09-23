package Ashwin_coding_practice;

public class Most_repeated_words {
    public static void main(String[] args) {
        String input = "Today is the greatest day ever!";
        String result = getWordWithMostRepeatedLetters(input);
        System.out.println("Word with most repeated letters: " + result);
    }

    public static String getWordWithMostRepeatedLetters(String str) {
        String[]words=str.replaceAll("[^a-zA-Z]","").split(" ");
        for(String word:words){
            int[]freq=new int[26];
            for(char ch:word.toLowerCase().toCharArray()){
                freq[ch-'a']++;
            }
            int currentmax=0;

        }


        return str;
    }
}