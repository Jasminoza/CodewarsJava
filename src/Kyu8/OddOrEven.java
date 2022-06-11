package Kyu8;

import java.util.Arrays;

public class OddOrEven {
    public static void main(String[] args) {
        int[] a = {2, 5, 34, 6};
        System.out.println(oddOrEven(a));
    }

    public static String oddOrEven(int[] array) {
        return (Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd");
    }
}
