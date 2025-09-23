package practice1;

import java.util.Scanner;

public class string_reverse {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input=scanner.nextLine();
		String rev="";
		char ch;
		for(int i=0;i<input.length();i++) {
			ch=input.charAt(i);
			rev=ch+rev;
			
		}
		System.out.println(rev);
		if(input.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
