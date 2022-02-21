package Kyu8;

/**
 * When provided with a number between 0-9, return it in words.
 * <p>
 * Input :: 1
 * * Output :: "One".
 * <p>
 * If your language supports it, try using a switch statement.
 */

public class SwitchItUp {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(switchItUp(number));
        number = 3;
        System.out.println(switchItUp(number));
        number = 5;
        System.out.println(switchItUp(number));
    }

    public static String switchItUp(int number) {
        return switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            default -> "Nine";
        };
    }

}
