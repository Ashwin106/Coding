package Numberprograms;

public class CombinationInArray {
    public static void main(String[] args) {
        int[] a = {1,2, -3, 4,5, 6, 7, 9,8,10,0,-1};

        // Step 1: Put elements in a HashSet for O(1) lookup
        int key=12  ;
//        Set<Integer> set = new HashSet<>();
//        for (int num : a) {
//            set.add(num);
//        }

        // System.out.println("Triplets (a, b, c) where a + b = c:");

        // Step 2: Check all pairs
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for(int k=i+2;k<a.length;k++) {
                    int sum = a[i] + a[j]+a[k];
                    //if (set.contains(sum))
                    if(sum==key){
                        System.out.println("(" + a[i] + ", " + a[j] + ", " +a[k]+")");
                    }

                }

            }
        }
    }
}
