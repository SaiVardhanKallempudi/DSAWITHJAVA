package Day1.Patterns;

public class SquarePattern {
    public static void main(String[] args) {
//        square(5);
//        System.out.println();
//        rightTriangle(5);
//        System.out.println();
//        reverseTriangle(5);
//        System.out.println();
        leftTriangle(5);
    }
    public static void square(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }
    public static void rightTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void reverseTriangle(int n){
        for (int i = n; i >0; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void leftTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print(" ");
            }
                for (int k = 0; k<=i; k++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}
