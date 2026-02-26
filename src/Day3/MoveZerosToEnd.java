package Day3;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(zerosToEnd(new int[]{0,1,3,0,12})));
        System.out.println(Arrays.toString(moveZeros(new int[]{0,0,0,5,2,5,2,0,2})));
    }
    public static int[] zerosToEnd(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int j=0;
        for (int k : arr) {
            if (k != 0) {
                res[j] = k;
                j++;
            }
        }
        return res;
    }
    public static int[] moveZeros(int[] arr) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        return arr;
    }
}
