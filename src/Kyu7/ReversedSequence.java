package Kyu7;

import java.util.Arrays;

public class ReversedSequence {
    public static void main(String[] args) {
        int n = 5;
        reverse(n);
    }

    public static int[] reverse(int n) {
        int[] arr = new int[n];
        for (int x = 0; x < n; x++) {
            arr[x] = n - x;
        }
        //System.out.println());
        return System.out.println(Arrays.toString(arr));
    }
}
