package Kyu8;


import java.io.IOException;

public class validatePINcode {
    public static void main(String[] args) {
        String a = "1234";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // true
        a = "0000";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // true
        a = "1111";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // true
        a = "123456";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // true
        a = "098765";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // true
        a = "000000";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // true
        a = "090909";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // true
        a = "a234";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = ".234";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = "1";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = "12";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = "123";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = "12345";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = "1234567";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = "-1234";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = "1.234";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = "00000000";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = "-123";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false
        a = "0000";
        System.out.println("\"" + a + "\"" + " - " + validatePin(a)); // false

    }

    public static boolean validatePin(String pin) {
        boolean pinIsCorrect = true;
        int pinLength = pin.length();
        int pinAsInt = -100;

        if (pinLength != 4 && pinLength != 6) {
            pinIsCorrect = false;
            return pinIsCorrect;
        }

        for (int x = 0; x < pinLength; x++) {
            boolean charIsCorrect = charIsInt(pin.substring(x, x + 1));
            if (!charIsCorrect) {
                pinIsCorrect = false;
            }
        }

        return pinIsCorrect;
    }


    public static boolean charIsInt(String letter) {
        boolean isCorrect = true;
            try {
                Integer.parseInt(letter);
            } catch (Exception e) {
                isCorrect = false;
            }
        return isCorrect;
    }

}
