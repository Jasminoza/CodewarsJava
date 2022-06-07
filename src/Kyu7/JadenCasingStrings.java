package Kyu7;

import java.util.Arrays;

public class JadenCasingStrings {

    public static void main(String[] args) {
        String phrase = "how can mirrors be real if our eyes aren't real";
        System.out.println(toJadenCase(phrase));
    }

    public static String toJadenCase(String phrase) {

        if (phrase == null || phrase.equals("")) return null;

        char[] arr = phrase.toCharArray();

        arr[0] = String.valueOf(arr[0]).toUpperCase().charAt(0);;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ' ') {
                arr[i + 1] = String.valueOf(arr[i+1]).toUpperCase().charAt(0);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }
}
