package practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequnecy_of_letters {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string: ");
		String input=scanner.nextLine();
		Map	<Character,Integer> frequency=new HashMap<>();
		for(char ch: input.toCharArray()) {
			frequency.put(ch, frequency.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry:frequency.entrySet()) {
			System.out.println(entry.getKey()+"= "+entry.getValue());
		}
		
		
		
	}

}
