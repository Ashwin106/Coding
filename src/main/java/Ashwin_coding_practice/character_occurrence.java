package Ashwin_coding_practice;

import java.util.HashMap;
import java.util.Map;

public class character_occurrence {
    public static void main(String[]args){
        String input="Programming";
        Map<Character,Integer> count=new HashMap<>();
        for(char ch:input.toCharArray()){
            count.put(ch,count.getOrDefault(ch,0)+1);

        }
        for(Map.Entry<Character,Integer>entry:count.entrySet()){
            System.out.println(" The letter "+entry.getKey()+" is repeated "+entry.getValue()+" times");
        }
    }
}
