package Day1.BasicMath;

public class EvenCheck {
    //check even odd with binary
    public static String isEven(int n){
        if((n&1)==0) return "Even";
        return "odd";
    }
    //check even or odd using division operator
    public static boolean isEvennum(int n){
        return n%2==0;
    }
    //jump by two numbers
    public static void jump(int n){
        for(int i=2; i<=n; i+=2) System.out.println(i);
    }
}
