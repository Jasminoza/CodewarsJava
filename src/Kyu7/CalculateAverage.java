package Kyu7;

import java.util.Arrays;

/**
 * Write a function which calculates the average of the numbers in a given list.
 * Note: Empty arrays should return 0.
 */

public class CalculateAverage {

    public static void main(String[] args) {
        int[] a = {1, 1, 1};
        System.out.println(find_average(a));
        int[] b = {1, 2, 3};
        System.out.println(find_average(b));
        int[] c = {0, 5};
        System.out.println(find_average(c));
    }

    public static double find_average(int[] array) {
        return ((array.length == 0) ? 0 : (double) (Arrays.stream(array).sum() / (double) array.length));
    }
}
