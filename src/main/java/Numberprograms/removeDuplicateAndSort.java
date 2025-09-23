package Numberprograms;

import java.util.Arrays;

public class removeDuplicateAndSort {
	public static void main(String[]args) {
		int[] arr= {1,4,6,2,1,4,7,6,};
		Arrays.sort(arr);///sort array
		
		int n=arr.length;
		int[]temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
					
			}
		}
		temp[j++]=arr[n-1];
		int[]result=new int[j];
		for(int i=0;i<j;i++) {
			result[i]=temp[i];
			
		}
		System.out.println("original array:" +Arrays.toString(arr));
		System.out.println("result: "+Arrays.toString(result));
		
		
	}

}
