package Kyu7;

import java.util.Base64;

public class YandexFinteh {

    public static void main(String[] args) {
        String code = "SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==";
        System.out.println(decode(code));
    }

    public static String decode(String code) {

        byte[] decodedBytes = Base64.getDecoder().decode(code);
        return new String(decodedBytes);

    }
}
