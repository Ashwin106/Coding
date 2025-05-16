package StringPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_Character {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=scanner.next();
        char[]word=str.toCharArray();
        Arrays.sort(word);

        for(int i=0;i<word.length;i++){
            if(word[i]==word[i+1]){
                System.out.println(word[i]);

                while(i<word.length-1&&word[i]==word[i+1]){
                    i++;
                }
            }
        }
    }
}
