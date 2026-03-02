package Day3.arrays;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerTwo(64));
    }
    public static boolean powerTwo(int n){
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
}
