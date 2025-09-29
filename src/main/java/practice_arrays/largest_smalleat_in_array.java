package practice_arrays;

public class largest_smalleat_in_array {
    public static void main(String[]args){
        int[]arr= {100,30,55,777,990,110,498};
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int num:arr){
            if(num>max){
                sec_max=max;
                max=num;
            }
            else if (num>sec_max&& num!=max){
                sec_max=num;
            }
            if(num<min){
                min=num;
            }
        }
        System.out.println("maximum:"+max);
        System.out.println("second max: "+sec_max);
        System.out.println("minimum: "+min);

    }
}
