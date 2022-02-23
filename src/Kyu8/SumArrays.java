package Kyu8;

import java.util.Arrays;

/**
 * Write a function that takes an array of numbers and returns the sum of the numbers.
 * The numbers can be negative or non-integer. If the array does not contain any
 * numbers then you should return 0.
 * <p>
 * Examples
 * Input: [1, 5.2, 4, 0, -1]
 * Output: 9.2
 * <p>
 * Input: []
 * Output: 0
 * <p>
 * Input: [-2.398]
 * Output: -2.398
 * <p>
 * Assumptions
 * You can assume that you are only given numbers.
 * You cannot assume the size of the array.
 * You can assume that you do get an array and if the array is empty, return 0.
 * Tests expect accuracy of 1e-4.
 * <p>
 * What We're Testing
 * We're testing basic loops and math operations. This is for beginners who are just learning loops and math operations.
 * Advanced users may find this extremely easy and can easily write this in one line.
 */

public class SumArrays {
    public static void main(String[] args) {
        double[] numbers = {};
        System.out.println(sum(numbers)); // 0
        double[] numbers2 = {1, 5.2, 4, 0, -1};
        System.out.println(sum(numbers2)); // 9.2
    }

    public static double sum(double[] numbers) {
        return (numbers.length == 0 ? 0 : Arrays.stream(numbers).sum());
    }
}