package Day3.arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {-5,-3,-6,-1,-7,-5};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            max = Math.max(num,max);
        }
        return max;
    }
}
