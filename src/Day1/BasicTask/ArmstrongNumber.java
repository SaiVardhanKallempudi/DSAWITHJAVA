package Day1.BasicTask;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(9474));
    }
    public static String isArmstrong(int number) {

        int original = number;
        int temp = number;
        int sum = 0;
        int count = 0;

        // Count digits using temp
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        temp = number;

        // Calculate sum
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp /= 10;
        }

        return sum == original ? "Armstrong Number" : "Not Armstrong Number";
    }
}
