package Kyu8;

/**
 * The cockroach is one of the fastest insects. Write a function which
 * takes its speed in km per hour and returns it in cm per second,
 * rounded down to the integer (= floored).
 * <p>
 * For example:
 * * 1.08 --> 30
 */

public class BeginnerSeries4Cockroach {
    public static void main(String[] args) {
        double x = 1.08;
        System.out.println(cockroachSpeed(x));//30
        x = 1.09;
        System.out.println(cockroachSpeed(x));//30
    }

    public static int cockroachSpeed(double x) {
        return (int) (x * 1000 * 100 / 3600);
    }

}
