package practice1;

import java.util.Arrays;

public class duplicate_in_string {
	public static void main(String[]args) {
		String word="radha";
		char [] ch=word.toCharArray();
		Arrays.sort(ch);
		StringBuilder result=new StringBuilder();
		for(int i=0;i<ch.length;i++) {
			if(i==0|| ch[i]!=ch[i-1]) {
				result.append(ch[i]);
				
			}
			
		}
		System.out.println(result.toString());
	} 

}
