package Practice_strings;

import java.util.HashSet;
import java.util.Set;

public class remove_duplicates_from_string {
    public static void main(String[]args){
        String input="Programming";
        Set<Character> set=new HashSet<>();
        for(char ch:input.toCharArray()){
            set.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:set){
            sb.append(c);
        }
        System.out.println("without duplicates: "+sb.toString() );
    }
}
