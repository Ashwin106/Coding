package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicateAndSortString {
	public static void main(String[]args) {
		 Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter a String: ");
	        String str=scanner.next();

	        char[] chars = str.toCharArray();

	        // Sort the character array
	        Arrays.sort(chars);

	        // Use StringBuilder to build the result without duplicates
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < chars.length; i++) {
	            // Append only if it's not the same as previous
	            if ( i==0|| chars[i] != chars[i - 1]) {
	                result.append(chars[i]);
	            }
	        }

	        System.out.println("Output: " + result.toString());
	    }
}
