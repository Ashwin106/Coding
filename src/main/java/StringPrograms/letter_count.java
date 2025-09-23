package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class letter_count {
	public static void main(String[]args) {
		String word="Ananthakrishnan";
		//char ch=word.charAt(0);
		String str=word.toLowerCase();
		Map<Character,Integer> charcount=new HashMap<>();
		for(char c:str.toCharArray()) {
			if(Character.isLetter(c)) {
					charcount.put(c, charcount.getOrDefault(c, 0)+1);
			}
		}
		for(Map.Entry<Character, Integer> entry:charcount.entrySet()) {
			System.out.println("Frequency of " +entry.getKey()+": "+entry.getValue());
		}
		
	}

}
