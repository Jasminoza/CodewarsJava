package Kyu7;

import java.util.Locale;

/**
 * Your task is to write a function which returns the sum of following series upto nth term(parameter).
 * <p>
 * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 * Rules:
 * You need to round the answer to 2 decimal places and return it as String.
 * <p>
 * If the given value is 0 then it should return 0.00
 * <p>
 * You will only be given Natural Numbers as arguments.
 * <p>
 * Examples:(Input --> Output)
 * 1 --> 1 --> "1.00"
 * 2 --> 1 + 1/4 --> "1.25"
 * 5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
 */
public class SumOfTheFirstNthTermOfSeries {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(seriesSum(n)); // 1;
        n = 5;
        System.out.println(seriesSum(n)); // 1.57;
        n = 9;
        System.out.println(seriesSum(n)); // 1.77;
    }

    public static String seriesSum(int n) {
        double answer = 0.00;
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            answer += 1.00 / (counter + 1);
            counter += 3;
        }
        return String.format(Locale.US, "%.2f", answer);
    }
}
