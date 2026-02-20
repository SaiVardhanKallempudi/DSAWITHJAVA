package Basics.BasicMath;

public class SumN {
    public static void main(String[] args) {
        sumOfNumbers(10);
    }
    public static void sumOfNumbers(int n){
        int sum =0;
        for(int i=0;i<=n;i++) sum+=i;
        System.out.println(sum);
    }
}
