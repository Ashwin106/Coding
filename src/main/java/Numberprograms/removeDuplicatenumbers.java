package Numberprograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicatenumbers {
	public static void main(String[]args) {
		 int[] arr = {4, 5, 6, 4, 2, 6, 9, 2, 1};
		 Arrays.sort(arr);
	        // Use LinkedHashSet to remove duplicates and maintain insertion order
	        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

	        for (int num : arr) {
	            uniqueNumbers.add(num);
	        }

	        System.out.println("Array after removing duplicates:");
	        for (int num : uniqueNumbers) {
	            System.out.print(num + " ");
	}

}
}
