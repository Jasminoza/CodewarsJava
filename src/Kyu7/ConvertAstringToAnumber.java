package Kyu7;

/**
 * We need a function that can transform a string into a number. What ways of achieving this do you know?
 */

public class ConvertAstringToAnumber {
    public static void main(String[] args) {
        String a = "1234";
        System.out.println(stringToNumber(a));
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

}
