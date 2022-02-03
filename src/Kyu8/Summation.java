package Kyu8;

public class Summation {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("Summation of numbers from 1 to " + a + " is - " + summation(a) + ".");
        a = 8;
        System.out.println("Summation of numbers from 1 to " + a + " is - " + summation(a) + ".");
    }

    public static int summation(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++) {
            sum = x + sum;
        }
        return sum;
    }
}
