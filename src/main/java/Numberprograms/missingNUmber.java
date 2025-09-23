package Numberprograms;

public class missingNUmber {
	
	 public static void main(String[] args) {
	        int[] arr = {11, 12, 13, 15, 16, 17, 18, 19}; // Missing 14

	        int actualSum = 0;
	        int min = arr[0];
	        int max = arr[0];

	        for (int num : arr) {
	            actualSum += num;
	            if (num < min) min = num;
	            if (num > max) max = num;
	        }

	        int expectedCount = max - min + 1;
	        int expectedSum = (expectedCount * (min + max)) / 2;

	        int missingNumber = expectedSum - actualSum;

	        System.out.println("Missing number is: " + missingNumber);
	    }

}
