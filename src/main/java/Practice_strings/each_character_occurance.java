package Practice_strings;

import java.util.HashMap;
import java.util.Map;

public class each_character_occurance {
    public static void main(String[]args){
        String input="ashwin";
        Map<Character,Integer> count=new HashMap<>();
        for(char c:input.toCharArray()){
            if(Character.isLetter(c)){
                count.put(c,count.getOrDefault(c,0)+1);
            }

        }
        for(Map.Entry<Character,Integer>entry:count.entrySet()){
            System.out.println("Frequency of "+entry.getKey() +":" +entry.getValue());
        }


    }
}
