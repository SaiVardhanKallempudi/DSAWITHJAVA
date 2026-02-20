package Basics.BasicMath;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(1234572928));
    }
    public static int countDigits(long n){
        int count=0;
        while(n !=0){
            n=n/10;
            count++;
        }
        return count;
    }
}
