package Kyu7;

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {

    public static void main(String[] args) {
        long n = 35231;
        System.out.println(Arrays.toString(digitize(n)));
    }

    public static int[] digitize(long n) {
        String nStr = "" + n;
        int[] arr = new int[nStr.length()];
        for (int x = nStr.length(); x > 0; x--) {
            arr[nStr.length() - x] = Integer.parseInt(nStr.substring(x-1, x));
        }
        return arr;
    }
}
