package Day2;


public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println(gradeCalculator(78));
    }
    public static String gradeCalculator(int marks) {
        if(marks<0 || marks>100) return "Invalid";
        if (marks >=95) {
            return "A";
        }else if (marks >=85) {
            return "B";
        }else if (marks >=75) {
            return "C";
        }else if (marks >=65) {
            return "D";
        }else if (marks >=55) {
            return "E";
        }
        return "F";
    }
}
