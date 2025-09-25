package StringPrograms;

import java.util.Scanner;

public class Frequency_of_letters {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string: ");
        String word=scanner.next();
        Scanner letter=new Scanner(System.in);
        System.out.println("Enter letter: ");
        char ch=letter.next().charAt(0);
        int frequency=0;

        System.out.println(word);
        for(int i=0;i<word.length();i++){
            if(ch==word.charAt(i)){
                frequency++;
                //System.out.println("Frequency of " +ch +"= " +frequency);
            }
        }
        System.out.println("Frequency of " +ch +"= " +frequency);

    }
}
