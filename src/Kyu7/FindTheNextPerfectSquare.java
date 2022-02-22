package Kyu7;

/**
 * You might know some pretty large perfect squares. But what about the NEXT one?
 * <p>
 * Complete the findNextSquare method that finds the next integral perfect square
 * after the one passed as a parameter. Recall that an integral perfect square is
 * an integer n such that sqrt(n) is also an integer.
 * <p>
 * If the parameter is itself not a perfect square then -1 should be returned.
 * You may assume the parameter is non-negative.
 * <p>
 * Examples:(Input --> Output)
 * 121 --> 144
 * 625 --> 676
 * 114 --> -1 since 114 is not a perfect square
 */

public class FindTheNextPerfectSquare {

    public static void main(String[] args) {
        long sq = 121;
        System.out.println(findNextSquare(sq)); // 144
        sq = 625;
        System.out.println(findNextSquare(sq)); // 676
        sq = 114;
        System.out.println(findNextSquare(sq)); // -1
    }

    public static long findNextSquare(long sq) {
        String sqSTR = "" + (Math.pow(sq, 0.5));
        int decimal = sqSTR.indexOf(".") + 1;
        if (sqSTR.charAt(decimal) == '0') {
            return (long) Math.pow((Math.pow(sq, 0.5)+1), 2);
        }
        return -1;
    }

    // 2nd variant:
//    public static long findNextSquare(long sq) {
//        String sqSTR = "" + (Math.pow(sq, 0.5));
//        return (sqSTR.charAt(sqSTR.indexOf(".") + 1) == '0' ? (long) Math.pow((Math.pow(sq, 0.5) + 1), 2) : -1);
//    }
}
