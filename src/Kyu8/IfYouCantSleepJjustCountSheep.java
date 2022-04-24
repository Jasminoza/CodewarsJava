package Kyu8;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer, 3 for example,
 * return a string with a murmur:
 * "1 sheep...2 sheep...3 sheep...".
 * Input will always be valid, i.e. no negative integers.
 */
public class IfYouCantSleepJjustCountSheep {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(countingSheep(num));
    }

    public static String countingSheep(int num) {
        List<String> str = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            str.add(i + " sheep...");
        }
        return String.join("", str);
    }

}
