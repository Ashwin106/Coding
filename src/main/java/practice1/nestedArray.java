package practice1;

import java.util.ArrayList;
import java.util.List;

public class nestedArray {
    public static void main(String[] args) {
        List<Integer> flatList = new ArrayList<>();
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        for(int[]array:arr){
            for (int num: array){
                flatList.add(num);
            }
        }
        System.out.println(flatList);

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                //flatList.add(arr[i][j]);
//               //System.out.print(arr[i][j]+" ");
//            }
//
//        }


    }
}
