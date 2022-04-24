package Kyu8;

import java.util.Arrays;

/**
 * Write a function to split a string and convert it into an array of words.
 *
 * Examples (Input -> Output):
 * * "Robin Singh" ==> ["Robin", "Singh"]
 *
 * * "I love arrays they are my favorite" ==>
 * ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
public class ConvertAStringToAnArray {
    public static void main(String[] args) {
        String s = "I love arrays they are my favorite";
        System.out.println(Arrays.toString(stringToArray(s))); // {"I", "love", "arrays", "they", "are", "my", "favorite"}
    }

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
