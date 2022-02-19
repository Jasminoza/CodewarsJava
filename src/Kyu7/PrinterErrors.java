package Kyu7;

import java.util.regex.Pattern;

/**
 * In a factory a printer prints labels for boxes. For one kind
 * of boxes the printer has to use colors which, for the sake of simplicity,
 * are named with letters from a to m.
 * <p>
 * The colors used by the printer are recorded in a control string.
 * For example a "good" control string would be aaabbbbhaijjjm meaning
 * that the printer used three times color a, four times color b, one
 * time color h then one time color a...
 * <p>
 * Sometimes there are problems: lack of colors, technical malfunction
 * and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm
 * with letters not from a to m.
 * <p>
 * You have to write a function printer_error which given a string
 * will return the error rate of the printer as a string representing
 * a rational whose numerator is the number of errors and the denominator
 * the length of the control string. Don't reduce this fraction to a simpler
 * expression.
 * <p>
 * The string has a length greater or equal to one and contains only letters from a to z.
 */

public class PrinterErrors {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(printerError(s)); // 3/56
    }

    public static String printerError(String s) {
        int errorCount = 0;
        for (int x = 0; x < s.length(); x++) {
            if (Pattern.matches("[^a-m]", s.substring(x, x + 1))) {
                errorCount++;
            }
        }
        return errorCount + "/" + s.length();
    }
}