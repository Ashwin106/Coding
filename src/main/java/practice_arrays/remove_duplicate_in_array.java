package practice_arrays;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class remove_duplicate_in_array {
    public static void main(String[]args){
        int[]arr={1,3,5,3,4,7,6,8,4,10,9,2,3,9};
        Set<Integer> unique=new TreeSet<>();
        for(int num:arr){
            unique.add(num);
        }
        System.out.println("after removing:");
        for(int num:unique){
            System.out.print(num+" ");
        }
    }
}
