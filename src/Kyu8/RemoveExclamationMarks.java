package Kyu8;

/**
 * Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
 */
public class RemoveExclamationMarks {
    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("Hello, world!"));
    }

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }

}
