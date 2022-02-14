package Kyu7;

public class SimpleMultiplication {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(simpleMultiplication(n));
    }

    public static int simpleMultiplication(int n) {
        return (n % 2 == 0 ? n * 8 : n * 9);
    }
}
