package Day3.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,5,6,7,13,15}, 9)));
    }
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(sum);
                return new int[]{left,right};
            }else if(sum < target){
                left++;
            }else {
                right--;
            }
        }
        return null;
    }
}
