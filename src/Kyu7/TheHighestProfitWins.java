package Kyu7;

import java.util.Arrays;

public class TheHighestProfitWins {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(minMax(arr)));
    }

    public static int[] minMax(int[] arr) {
        int[] newArr = new int[2];
        newArr[0] = Arrays.stream(arr).min().getAsInt();
        newArr[1] = Arrays.stream(arr).max().getAsInt();
        return newArr;
    }
}
