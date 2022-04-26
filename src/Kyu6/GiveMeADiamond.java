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
        int n = 1;
        System.out.println(print(n));
        System.out.println();
        n = 3;
        System.out.println(print(n));
        System.out.println();
        n = 5;
        System.out.println(print(n));
        System.out.println();
        n = -345;
        System.out.println(print(n));//null
        System.out.println();
        n = 6;
        System.out.println(print(n));//null
        System.out.println();
        n = 15;
        System.out.println(print(n));
    }

    public static String print(int n) {

        if (n <= 0 || n % 2 == 0) {
            return null;
        }

        if (n == 1) {
            return "*\n";
        }

        String[] diamond = new String[n];

        int starsCount = 1;
        int firstHalf = (n - 1) / 2 + 1;
        int spacesCount = firstHalf - 1;
        int secondHalf = n - firstHalf;

        for (int i = 0; i <= firstHalf; i++) {
            diamond[i] = makeSpaces(spacesCount) + makeStars(starsCount) + "\n";
            starsCount += 2;
            spacesCount--;
        }

        starsCount -= 2;
        spacesCount++;

        int m = secondHalf;
        for (int i = n; i >= secondHalf + 1; i--) {

            starsCount -= 2;
            spacesCount++;
            diamond[m] = makeSpaces(spacesCount) + makeStars(starsCount) + "\n";
            m++;
        }

        return String.join("", diamond);
    }

    public static String makeSpaces(int m) {
        return " ".repeat(Math.max(0, m));
    }

    public static String makeStars(int l) {
        return "*".repeat(Math.max(0, l));
    }
}
