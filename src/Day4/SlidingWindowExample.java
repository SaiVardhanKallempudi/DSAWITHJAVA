package Day4;

public class SlidingWindowExample {
    public static int maxSum(int[] arr, int k) {
        int n = arr.length;
        // Edge case: If the array size is less than k
        if (n < k) {
            System.out.println("Invalid input");
            return -1;
        }
        // Compute the sum of the first window
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        // Sliding the window
        int windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // Add the next element and remove the first element of the previous window
            maxSum = Math.max(maxSum, windowSum); // Update the maximum sum
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSum(arr, k));
    }
}