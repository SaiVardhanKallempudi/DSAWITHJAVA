package Day3.arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverse(new int[] {1,2,3,4,5,6})));
    }
    public static int[] reverse(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
