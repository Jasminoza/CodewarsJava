package Kyu7;

public class ClockInMilliseconds {

    public static void main(String[] args) {
        int h, m, s;
        h = 0; m = 1; s = 1;
        System.out.println(Past(h, m, s));
    }

    public static int Past(int h, int m, int s) {
        return (s * 1000) + (m * 1000 * 60) + (h * 1000 * 60 * 60);
    }
}
