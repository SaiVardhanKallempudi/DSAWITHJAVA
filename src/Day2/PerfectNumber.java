package Day2;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }
    public static boolean isPerfect(int n) {

        if (n <= 1) return false;

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }
}
