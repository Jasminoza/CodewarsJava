package Kyu7;

public class GrowthOfApopulation {
    public static void main(String[] args) {
        int a = 1500; double b = 5; int c = 100; int d = 5000;
        System.out.println(nbYear(a, b, c, d));
        a = 1500000; b = 2.5; c = 10000; d = 2000000;
        System.out.println(nbYear(a, b, c, d));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int yearCount = 0;
        for (yearCount = 0; p0 < p; yearCount++) {
            p0 = (int) (p0 + p0 * percent / 100 + aug);
        }
        return yearCount;
    }
}
