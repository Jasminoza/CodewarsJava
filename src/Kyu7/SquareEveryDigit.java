package Kyu7;

import java.util.Arrays;

/**
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * <p>
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 * <p>
 * Note: The function accepts an integer and returns an integer
 */

public class SquareEveryDigit {
    public static void main(String[] args) {
        int n = 9119;
        System.out.println(squareDigits(n)); //811181
        n = 0;
        System.out.println(squareDigits(n)); //0
    }

    public static int squareDigits(int n) {
        String str = "" + n;
        String answer = "";
        int[] arr = new int[str.length()];
        for (int x = 0; x < str.length(); x++) {
            arr[x] = Integer.parseInt(str.substring(x, x + 1));
        }

        for (int x = 0; x < arr.length; x++) {
            arr[x] = (int) Math.pow(arr[x], 2);
        }

        for (int x = 0; x < arr.length; x++) {
            answer = answer + arr[x];
        }
        return Integer.parseInt(answer);
    }
}