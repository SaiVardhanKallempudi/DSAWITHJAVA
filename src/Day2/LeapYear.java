package Day2;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(2015));
        System.out.println(isLeapYear(2026));
        System.out.println(isLeapYear(2027));
        System.out.println(isLeapYear(2028));
        System.out.println(isLeapYear(2029));
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(-2021));
        System.out.println(isLeapYear(1000000001));
    }

    public static String isLeapYear(int year) {

        if (year < 1 || year > 1000000000) {
            return "Invalid input. Year must be between 1 and 10^9";
        }
        if (year % 400 == 0) {
            return "Leap Year";
        } else if (year % 100 == 0) {
            return "Not Leap Year";
        } else if (year % 4 == 0) {
            return "Leap Year";
        } else {
            return "Not Leap Year";
        }
    }
}