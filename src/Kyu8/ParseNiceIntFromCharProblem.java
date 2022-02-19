package Kyu8;

public class ParseNiceIntFromCharProblem {
    public static void main(String[] args) {
        String herOld = "5 years old";
        System.out.println(howOld(herOld)); // 5
        herOld = "9 years old";
        System.out.println(howOld(herOld)); // 9
        herOld = "1 year old";
        System.out.println(howOld(herOld)); // 1
    }

    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.substring(0, 1));
    }
}
