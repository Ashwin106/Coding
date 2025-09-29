package practice_arrays;

import java.util.Arrays;

public class rotate_array {
    public static void main(String[]args){
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(arr);
        k=k%arr.length;

        int[] rotated=new int[arr.length];
        int index=0;
        for(int i=k;i< arr.length;i++){
            rotated[index++]=arr[i];
        }
        for(int i=0;i<k;i++){
            rotated[index++]=arr[i];

        }
        System.out.println("rotated array: "+ Arrays.toString(rotated));

    }
}
