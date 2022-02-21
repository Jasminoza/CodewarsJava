package Kyu8;

import java.util.Arrays;

/**
 * You will be given an array a and a value x.
 * All you need to do is check whether the provided array contains the value.
 * <p>
 * Array can contain numbers or strings. X can be either.
 * <p>
 * Return true if the array contains the value, false if not.
 */

public class YouOnlyNeedOneBeginner {
    public static void main(String[] args) {
        Object[] a = {66, 101};
        Object x = 66;
        System.out.println(check(a, x));
        Object[] b = {80, 117, 115, 104, 45, 85, 112, 115};
        x = 45;
        System.out.println(check(b, x));
        Object[] c = {'t', 'e', 's', 't'};
        x = 'e';
        System.out.println(check(c, x));
        Object[] d = {"what", "a", "great", "kata"};
        x = "kat";
        System.out.println(check(d, x));
    }

    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) {
                return true;
            }
        }
        return false;
    }
}
