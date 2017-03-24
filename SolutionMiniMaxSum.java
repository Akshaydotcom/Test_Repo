import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionMiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long sum1 = b+c+d+e;
        long sum2 = a+c+d+e;
        long sum3 = a+b+d+e;
        long sum4 = a+c+b+e;
        long sum5 = a+c+d+b;
        long answer= (Math.min(sum1, Math.min(sum2, Math.min(sum3, Math.min(sum4,sum5)))));
        long answer2=(Math.max(sum1, Math.max(sum2, Math.max(sum3, Math.max(sum4,sum5)))));
		System.out.println(answer+" "+answer2);
    }
}
