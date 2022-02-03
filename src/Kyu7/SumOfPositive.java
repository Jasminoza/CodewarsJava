package Kyu7;

import java.util.Arrays;

public class SumOfPositive {
    public static void main(String[] args) {
        int[] a = {-1,-2,-3,-4,-5};
        System.out.println(sum(a));
    }

    public static int sum(int[] arr){
        for (int x = 0; x < arr.length; x++) {
            arr[x] = (arr[x] < 0 ? 0 : arr[x]);
        }
        return Arrays.stream(arr).sum();
        }
    }
