package Ashwin_coding_practice;

import com.sun.source.doctree.SeeTree;

import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicates {
    public static void main(String[]args){
        String input="programming";
        Set<Character> set=new LinkedHashSet<>();
        for(char ch:input.toCharArray()){
            set.add(ch);
        }
        StringBuilder res=new StringBuilder();
        for(char c: set){
            res.append(c);
        }
        System.out.println(res.toString());

    }
}
