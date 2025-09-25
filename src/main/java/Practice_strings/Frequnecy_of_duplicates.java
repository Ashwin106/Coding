package Practice_strings;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Frequnecy_of_duplicates {
    public static void main(String[] args) {
        String input = "Programming";
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (char c : input.toLowerCase().toCharArray()) {
            if(Character.isLetter(c)){
                if(!set.add(c)){
                    freqMap.put(c,freqMap.getOrDefault(c,0)+1);

                }
                else{
                    freqMap.put(c,1);
                }
            }

        }
        boolean hasDuplicates = false;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                hasDuplicates = true;
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicate letters found.");
        }
    }
}
