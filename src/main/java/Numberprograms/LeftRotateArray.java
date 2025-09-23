package Numberprograms;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(arr.length);

        // Normalize k if greater than array length
        k = k % arr.length;
        System.out.println(k);

        // Rotate the array
        int[] rotated = new int[arr.length];
        int index = 0;

        // Copy from k to end
        for (int i = k; i < arr.length; i++) {
            rotated[index++] = arr[i];
        }

        // Copy from start to k
        for (int i = 0; i < k; i++) {
            rotated[index++] = arr[i];
        }

        // Output result
        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }

}
