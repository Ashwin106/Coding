package Numberprograms;

public class rearrangeDigits {
	//public class Main {
		public static void main(String[] args) {
		String str = "32400121200";
		String output = rearrangeDigits(str);
		System.out.println("Output: " + output);
		}
	public static String rearrangeDigits(String str) {
		StringBuilder nonZero = new StringBuilder();
        StringBuilder zeros = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '0') {
                zeros.append(c);
            } else {
                nonZero.append(c);
            }
        }

        return nonZero.toString() + zeros.toString();
    }
	}
		
	

