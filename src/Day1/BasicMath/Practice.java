package Day1.BasicMath;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(s+" "+n);

        Console c = System.console();
        String s1 = c.readLine();
        System.out.println(s1+" "+n);

//        int c = Integer.MAX_VALUE;
//        System.out.println(a);
//        a = 4;
//        System.out.println(a);
//        Integer[] a = {3,1,2}; Arrays.sort(a, Collections.reverseOrder());
//        System.out.println(Arrays.toString(a));
//        int[] a = {1,2,3}; int[] b = a;
//        int[] c = Arrays.copyOf(a, a.length);
//        a[0] = 99;
//        b[1] = 999;
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(c));
//        String s = "hello"; s.toUpperCase();
//        System.out.println(s);
//        s = s.toUpperCase();
//        System.out.println(s);
    }
}
