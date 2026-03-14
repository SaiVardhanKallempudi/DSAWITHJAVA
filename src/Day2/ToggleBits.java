package Day2;

public class ToggleBits {
    public static void main(String[] args) {
        toggleBits(6);
        System.out.println("=========================================================");
        toggleBitsOptimized(10);
    }
    public static void toggleBits(int n){
        String binary1 = Integer.toBinaryString(n);
        System.out.println("Binary: " + binary1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binary1.length(); i++) {
            if (binary1.charAt(i) == '1') {
                sb.append(0);
            }else {
                sb.append(1);
            }
        }
        System.out.println("After Toggle: "+sb);
        int togNum = Integer.parseInt(sb.toString(), 2);
        System.out.println("integer: "+togNum);

    }

    //optimized
    public static void toggleBitsOptimized(int n) {

        int bits = Integer.toBinaryString(n).length();

        int mask = (1 << bits) - 1;

        int result = n ^ mask;

        System.out.println("Original: " + n);
        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Toggled: " + result);
        System.out.println("Binary toggled: " + Integer.toBinaryString(result));
    }
}
