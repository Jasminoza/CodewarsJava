package Kyu8;

import java.util.Arrays;

/**
 * Define String.prototype.toAlternatingCase (or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; see the initial solution for details) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:
 * <p>
 * StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
 * StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
 * StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
 * StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
 * StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
 * StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
 */

public class altERnaTIngcAsE {
    public static void main(String[] args) {
        String string = "hello world";
//        System.out.println(toAlternativeString(string));
//        string = "HELLO WORLD";
//        System.out.println(toAlternativeString(string));
//        string = "hello WORLD";
//        System.out.println(toAlternativeString(string));
//        string = "hEllO wOrld";
//        System.out.println(toAlternativeString(string));
//        string = "12345";
//        System.out.println(toAlternativeString(string));
//        string = "1a2b3c4d5e";
//        System.out.println(toAlternativeString(string));
        string = "sTRINGuTILS.TOaLTERNATINGcASE";
        System.out.println(toAlternativeString(string));
    }

    public static String toAlternativeString(String string) {
        char[] arr = string.toCharArray();

        for (int x = 0; x < arr.length; x++) {
            if (Character.isLowerCase(arr[x])) {
                arr[x] = Character.toUpperCase(arr[x]);
            } else {
                arr[x] = Character.toLowerCase(arr[x]);
            }
        }
        string = "";
        for (int x = 0; x < arr.length; x++) {
            string = string + arr[x];
        }
        return string;
    }
}
