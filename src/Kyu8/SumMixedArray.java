package Kyu8;

import java.util.List;

/**
 * Given an array of integers as strings and numbers,
 * return the sum of the array values as if all were numbers.
 * <p>
 * Return your answer as a number.
 */
public class SumMixedArray {
    public static void main(String[] args) {

    }

    public class MixedSum {

        public static int sum(List<?> mixed) {
            int sum = 0;
            for (int i = 0; i < mixed.size(); i++) {
                sum += Integer.parseInt(mixed.get(i) + "");
            }
            return sum;
        }
    }
}
