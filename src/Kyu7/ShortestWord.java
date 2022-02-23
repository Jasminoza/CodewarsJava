package Kyu7;

import java.util.Arrays;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 * <p>
 * String will never be empty and you do not need to account for different data types.
 */

public class ShortestWord {
    public static void main(String[] args) {
        String s = "bitcoin take over the world maybe who knows perhaps";
        System.out.println(findShort(s)); // 3
        s = "turns out random test cases are easier than writing out basic ones";
        System.out.println(findShort(s)); // 3
        s = "Let's travel abroad shall we";
        System.out.println(findShort(s)); // 2
    }

    public static int findShort(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "" + arr[i].length();
        }
        int[] arrLength = new int[arr.length];
        for (int i = 0; i < arrLength.length; i++) {
            arrLength[i] = Integer.parseInt(arr[i]);
        }
        return Arrays.stream(arrLength).min().getAsInt();
    }
}
