package Kyu6;

/**
 * Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond
 * string from James. Since James doesn't know how to make this happen, he needs your help.
 * <p>
 * Task
 * You need to return a string that looks like a diamond shape when printed on the screen,
 * using asterisk (*) characters. Trailing spaces should be removed, and every line must
 * be terminated with a newline character (\n).
 * <p>
 * Return null/nil/None/... if the input is an even number or negative, as it is not
 * possible to print a diamond of even or negative size.
 * <p>
 * Examples
 * A size 3 diamond:
 * <p>
 * *
 * ***
 * *
 * ...which would appear as a string of " *\n***\n *\n"
 * <p>
 * A size 5 diamond:
 * <p>
 * *
 * ***
 * *****
 * ***
 * *
 * ...that is:
 * <p>
 * "  *\n ***\n*****\n ***\n  *\n"
 */


public class GiveMeADiamond {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(print(n));
//        n = 5;
//        System.out.println(print(n));
//        n = -345;
//        System.out.println(print(n));//null
//        n = 6;
//        System.out.println(print(n));//null
//        n = 15;
//        System.out.println(print(n));
    }

    public static String print(int n) {

        if (n <= 0 || n % 2 == 0) {
            return null;
        }

        String stars = "";
        String spaces = "";
        String newLines = "\n";
        String diamond = "";

        for (int x = 0; x < n; x++) {
            stars = stars + "*";
        }

        diamond = newLines + stars + newLines;

        return diamond.substring(0, diamond.length() - 2);

        //           " *\n***\n *\n"

        //return "  *\n ***\n*****\n ***\n  *\n";
    }
}
