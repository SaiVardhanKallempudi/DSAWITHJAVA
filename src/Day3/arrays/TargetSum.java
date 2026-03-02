package Day3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSum {
    public static void main(String[] args) {
        System.out.println(targetSum(new int[]{1,2,3,4,5}, 6));
    }
    public static List<List<Integer>> targetSum(int[] arr, int target){
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                result.add(Arrays.asList(arr[left],arr[right]));
                left++;
                right--;
            }else if(arr[left]+arr[right]>target){
                right--;
            }else{
                left++;
            }
        }
        return result;
    }
}
