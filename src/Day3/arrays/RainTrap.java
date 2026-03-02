package Day3.arrays;

public class RainTrap {
    public static void main(String[] args) {
        System.out.println(rainTraps(new int[]{4,2,0,3,2,5}));
    }
    public static int rainTrap(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    totalWater += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    totalWater += rightMax - arr[right]; // Trap water!
                }
                right--;
            }
        }
        return totalWater;
    }

    //brute force
    public static int rainTraps(int[] arr) {
        int n = arr.length;
        int totalWater = 0;

        for (int i = 1; i < n - 1; i++) {

            int maxLeft = arr[i];
            for (int j = 0; j < i; j++) {
                maxLeft = Math.max(maxLeft, arr[j]);
            }

            int maxRight = arr[i];
            for (int j = i + 1; j < n; j++) {
                maxRight = Math.max(maxRight, arr[j]);
            }

            totalWater += Math.min(maxLeft, maxRight) - arr[i];
        }
        return totalWater;
    }
}
