package Kyu6;

import java.util.HashMap;
import java.util.Map;

/**
 * Count the number of Duplicates
 * Write a function that will return the count of distinct case-insensitive
 * alphabetic characters and numeric digits that occur more than once in the
 * input string. The input string can be assumed to contain only alphabets
 * (both uppercase and lowercase) and numeric digits.
 * <p>
 * Example
 * "abcde" -> 0 # no characters repeats more than once
 * "aabbcde" -> 2 # 'a' and 'b'
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2 # 'a' and '1'
 * "ABBA" -> 2 # 'A' and 'B' each occur twice
 */

public class CountingDuplicates {
    public static void main(String[] args) {
        String text = "abcdea";
        System.out.println(duplicateCount(text));
        text = "qwertyQWER";
        System.out.println(duplicateCount(text));
    }

    public static int duplicateCount(String text) {
        if (text.length() == 0) return 0;

        text = text.toLowerCase();
        Map<Character, Integer> charAndCount = new HashMap<>();
        charAndCount.put(text.charAt(0), 1);
        int answer = 0;

        for (int i = 1; i < text.length(); i++) {
            charAndCount.putIfAbsent(text.charAt(i), 0);
            charAndCount.replace(text.charAt(i), charAndCount.get(text.charAt(i)) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charAndCount.entrySet()) {
            if (charAndCount.get(entry.getKey()) != 1) {
                answer += 1;
            }
        }
        return answer;
    }
}
