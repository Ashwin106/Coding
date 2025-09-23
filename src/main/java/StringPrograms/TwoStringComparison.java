package StringPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStringComparison {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str1 = scanner.nextLine().toLowerCase();
		System.out.println("Enter second string: ");
		String str2 = scanner.nextLine().toLowerCase();

		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();

		for (char c : str1.toCharArray()) {
			if (Character.isLetter(c)) {
				set1.add(c);

			}
		}
		for (char c : str2.toCharArray()) {
			if (Character.isLetter(c)) {
				set2.add(c);
			}

		}
		set1.retainAll(set2);

		if (set1.isEmpty()) {
			System.out.println("no common ");
		} else {
			System.out.println("common letter: ");
			for (char c : set1) {
				System.out.println(c);
			}
		}

	}

}
