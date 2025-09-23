package practice1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicate {
    public static void main(String[]args){
        int[]arr={4, 5, 6, 4, 2, 6, 9, 2, 1};
        Arrays.sort(arr);
        Set<Integer> unique= new HashSet<Integer>();
        for(int num:arr){
            unique.add(num);
        }
        System.out.println("unique numbers:");
        for(int num:unique) {
            System.out.println(+num);
        }
    }
}
