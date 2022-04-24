package Kyu6;

import java.util.Arrays;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 * <p>
 * There will always be only one integer that appears an odd number of times.
 * <p>
 * Examples
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */
public class FindTheOddInt {
    public static void main(String[] args) {
        int[] a = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findIt(a));// 5
        int[] a1 = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        System.out.println(findIt(a1)); // -1
        int[] a2 = {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        System.out.println(findIt(a2)); // 10

    }

    public static int findIt(int[] a) {
        if (a.length == 1) return a[0];

        Arrays.sort(a);
        if (a[a.length - 1] != a[a.length - 2]) {
            return a[a.length - 1];
        }

        int numCount = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                numCount++;
            } else {
                if (numCount % 2 != 0) {
                    return a[i];
                } else {
                    numCount = 1;
                }
            }
        }
        return 0;
    }
}

