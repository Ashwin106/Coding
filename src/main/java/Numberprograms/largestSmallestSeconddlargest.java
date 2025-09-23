package Numberprograms;

public class largestSmallestSeconddlargest {
	public static void main(String[] args) {
		int[]arr= {100,30,55,777,990,110,498};
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;

		for(int num:arr) {
			if(num>largest) {
				second=largest;
				largest=num;
			}
			else if(num>second && num!= largest) {
				second=num;
			}
			if(num<smallest) {
				smallest=num;
			}
		}
		System.out.println("largest:"+largest);
		System.out.println("Second Largest:"+second);
		System.out.println("Smallest:"+smallest);
	}

}
