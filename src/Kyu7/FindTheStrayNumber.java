package Kyu7;

import java.util.Arrays;

public class FindTheStrayNumber {
    public static void main(String[] args) {
        int[] num = {1, 1, 2};
        System.out.println(stray(num)); // 2
        int[] num1 = {17, 17, 3, 17, 17, 17, 17};
        System.out.println(stray(num1)); // 3
    }

    static int stray(int[] numbers) {
        int[] numSorted = Arrays.stream(numbers).sorted().toArray();
        return (numSorted[0] == numSorted[1] ? numSorted[numSorted.length - 1] : numSorted[0]);
    }
}