package Kyu7;

import java.util.Arrays;

/**
 * Your task is to make a function that can take any non-negative integer
 * as an argument and return it with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 *
 * Examples:
 * Input: 42145 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 123456789 Output: 987654321
 */

public class DescendingOrder {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println(sortDesc(num));//987654321
    }

    public static int sortDesc(final int num) {
        String str = "" + num;
        String answer = "";
        int[] arr = new int[str.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            answer = answer + arr[i];
        }
        return Integer.parseInt(answer);
    }

}
