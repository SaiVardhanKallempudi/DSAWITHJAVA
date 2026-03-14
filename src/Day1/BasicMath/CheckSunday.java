package Day1.BasicMath;

public class CheckSunday {
    public static void main(String[] args) {
        System.out.println(checkSunday("Monday", 20));
    }

    public static int checkSunday(String day, int n) {

        int sum = 0;
        int count = 0;

        sum = switch (day) {
            case "Sunday" -> 0;
            case "Monday" -> 6;
            case "Tuesday" -> 5;
            case "Wednesday" -> 4;
            case "Thursday" -> 3;
            case "Friday" -> 2;
            case "Saturday" -> 1;
            default -> sum;
        };

        if (sum <= n) {
            count = 1;
        }

        while (sum + 7 <= n) {
            sum += 7;
            count++;
        }

        return count;
    }
}