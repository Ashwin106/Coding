package practice1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class nonrepeatingcharacter {
	public static void main(String[] args) {
		String input = "aathira";

		Map<Character, Integer> frequency = new LinkedHashMap<>();
			for (char ch : input.toCharArray()) {
				frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
			}
		Character result = null;
		for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
			if (entry.getValue() == 1) {
				// System.out.println(entry.getKey());
				result = entry.getKey();
				break;

			}

		}
		if(result!=null) {
			System.out.println(result);
		}
			else {
				System.out.println("no repeateing letters");
			}

	}
}
