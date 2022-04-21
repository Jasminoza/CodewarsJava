package Kyu7;

/**
 * Given two integers a and b, which can be positive or negative,
 * find the sum of all the integers between and including them
 * and return it. If the two numbers are equal return a or b.
 * <p>
 * Note: a and b are not ordered!
 * <p>
 * Examples (a, b) --> output (explanation)
 * (1, 0) --> 1 (1 + 0 = 1)
 * (1, 2) --> 3 (1 + 2 = 3)
 * (0, 1) --> 1 (0 + 1 = 1)
 * (1, 1) --> 1 (1 since both are same)
 * (-1, 0) --> -1 (-1 + 0 = -1)
 * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 */

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println(GetSum(1, 2));
        System.out.println(GetSum(-1, 2));

    }

    public static int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }

        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
            return sum;
        }
    }

}
