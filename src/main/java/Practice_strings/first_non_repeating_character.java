package Practice_strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class first_non_repeating_character {
    public static void main(String[]args){
        String input="Ananthakrishnan";
        Map<Character,Integer>frequency=new LinkedHashMap<>();
        for(char ch:input.toLowerCase().toCharArray()){
            frequency.put(ch, frequency.getOrDefault(ch,0)+1);
        }
        Character result=null;
        for(Map.Entry<Character,Integer> entry:frequency.entrySet()){
            if(entry.getValue()==1){
                result=entry.getKey();
                break;
            }
        }
        if(result!=null){
            System.out.println("First non repeated letter: "+result);
        }
        else{
            System.out.println("no repeated letters");
        }
    }



}
