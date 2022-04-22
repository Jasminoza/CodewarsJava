package Kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Your task is to sort a given string. Each word in the string will
 * contain a single number. This number is the position the word should have in the result.
 * <p>
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * <p>
 * If the input string is empty, return an empty string. The words in the
 * input String will only contain valid consecutive numbers.
 * <p>
 * Examples
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 */
public class YourOrderPlease {

    public static void main(String[] args) {
        String str = "is2 Thi1s T4est 3a";
        System.out.println(order(str)); // Thi1s is2 3a T4est
        str = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(order(str)); // Fo1r the2 g3ood 4of th5e pe6ople
        str = "";
        System.out.println(order(str)); // ""
    }

    public static String order(String words) {
        if (words.length() <= 0) {
            return "";
        } else {
            String[] strings = words.split(" ");
            String[] list = new String[strings.length];
            int n = 1;
            for (String string : strings) {
                for (int j = 1; j <= strings.length; j++)
                    if (string.contains(j + "")) {
                        list[j - 1] = string;
                    }
            }
            return String.join(" ", list);
        }
    }
}
