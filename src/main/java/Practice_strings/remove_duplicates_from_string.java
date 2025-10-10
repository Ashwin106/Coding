package Practice_strings;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class remove_duplicates_from_string {
    public static void main(String[]args){
        String input="Programming";
        Set<Character> unique=new HashSet<>();
        Set<Character> duplicate=new HashSet<>();
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for(char ch:input.toCharArray()){
            if(!unique.add(ch)){
                freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
                duplicate.add(ch);
            }
            else{
                freqMap.put(ch,1);
            }
            //unique.add(ch)
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(char c:unique){
            sb.append(c);
        }
        for(char d:duplicate){
            sb1.append(d);
        }
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                //hasDuplicates = true;
            }
        }
        System.out.println(" unique : "+sb.toString() );
        System.out.println("duplicates:" +sb1.toString());
    }
}
