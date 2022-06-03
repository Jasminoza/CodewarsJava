package Kyu8;

import java.util.Arrays;
import java.util.Locale;

public class AbbreviateTwoWordName {
    public static void main(String[] args) {
        String a = "Sam Harris";
        System.out.println("Abbr to " + a + " is " + abbrevName(a));
    }


    public static String abbrevName(String name) {
        String abbr;
        String[] words = new String[2];
        words[0] = name.substring(0, name.indexOf(" "));
        words[1] = name.substring(name.indexOf(" ") + 1);
        abbr = words[0].substring(0, 1) + "." + words[1].substring(0, 1) + ".";
        abbr = abbr.toUpperCase();
        return abbr;
    }

}
