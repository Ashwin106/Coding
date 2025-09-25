package Practice_strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class first_repeated_word {
    public static void main(String[]args){
        String input="radha";
        Map<Character,Integer> frequnecy=new LinkedHashMap<>();
        for(char ch:input.toLowerCase().toCharArray()){
            frequnecy.put(ch,frequnecy.getOrDefault(ch,0)+1);
        }
        Character result=null;
        for(Map.Entry<Character,Integer>entry:frequnecy.entrySet()){
            if(entry.getValue()>1){
                result=entry.getKey();
                break;
            }
        }
        if(result!=null){
            System.out.println("repeated word: "+result);
        }
        else{
            System.out.println("no repeated words");
        }
    }
}
