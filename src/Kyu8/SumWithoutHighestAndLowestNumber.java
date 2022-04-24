package Kyu8;

import java.util.Arrays;

/**
 * Sum all the numbers of a given array ( cq. list ),
 * except the highest and the lowest element (by value, not by index! ).
 * <p>
 * The highest or lowest element respectively is
 * a single element at each edge, even if there
 * are more than one with the same value.
 * <p>
 * Mind the input validation.
 * <p>
 * Example
 * { 6, 2, 1, 8, 10 } => 16
 * { 1, 1, 11, 2, 3 } => 6
 * Input validation
 * If an empty value ( null, None, Nothing etc. )
 * is given instead of an array, or the given array
 * is an empty list or a list with only 1 element, return 0.
 */

public class SumWithoutHighestAndLowestNumber {

    public static void main(String[] args) {
        int[] numbers = {6, 2, 1, 8, 10};
        System.out.println(sum(numbers)); // 16
    }

    public static int sum(int[] numbers) {
        if (((numbers == null) || numbers.length <= 1)) return 0;
        return Arrays.stream(numbers).sum() - Arrays.stream(numbers).min().getAsInt() - Arrays.stream(numbers).max().getAsInt();
    }
}
