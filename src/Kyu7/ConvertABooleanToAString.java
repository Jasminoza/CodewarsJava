package Kyu7;

public class ConvertABooleanToAString {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(convert(b));
    }

    public static String convert(boolean b) {
        return (b ? "" + true : "" + false);
    }
}

