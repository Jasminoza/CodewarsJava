package Kyu8;

import java.util.Arrays;

public class WhatIsBetween {
    public static void main(String[] args) {
        int from1 = 1;
        int to1 = 4;
        int[] between1 = {1, 2, 3, 4};
        System.out.println(Arrays.equals(between(from1, to1), between1));
        int from2 = -2;
        int to2 = 2;
        int[] between2 = {-2, -1, 0, 1, 2};
        System.out.println(Arrays.equals(between(from2, to2), between2));

    }

    public static int[] between(int a, int b) {
        int[] arr = new int[b - a + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + i;
        }
        return arr;
    }
}


