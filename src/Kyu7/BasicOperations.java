package Kyu7;

public class BasicOperations {
    public static void main(String[] args) {
        String op = "+";
        int v1 = 4;
        int v2 = 7;
        System.out.println(basicMath(op, v1, v2));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            default:
                return v1 / v2;
        }
    }
}
