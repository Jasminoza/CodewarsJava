package Kyu6;

import java.util.HashMap;

/**
 * The goal of this exercise is to convert a string to a new string
 * where each character in the new string is "(" if that character
 * appears only once in the original string, or ")" if that character
 * appears more than once in the original string. Ignore capitalization
 * when determining if a character is a duplicate.
 *
 * Examples
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 * Notes
 * Assertion messages may be unclear about what they display
 * in some languages. If you read "...It Should encode XXX",
 * the "XXX" is the expected result, not the input!
 */

public class DuplicateEncoder {
    public static void main(String[] args) {
        String word = "Prespecialized";
        System.out.println(encode(word).equals(")()())()(()()("));
        String word2 = "   ()(   ";
        System.out.println(encode(word2).equals("))))())))"));

    }

    static String encode(String word){
        String wordIgnoreCase = word.toLowerCase();
        HashMap<Character, Integer> charsAndCounts = new HashMap<>();
        for (int i = 0; i < wordIgnoreCase.length(); i++) {
            if (!charsAndCounts.containsKey(wordIgnoreCase.charAt(i))) {
                charsAndCounts.put(wordIgnoreCase.charAt(i), 1);
            } else {
                charsAndCounts.replace(wordIgnoreCase.charAt(i), charsAndCounts.get(wordIgnoreCase.charAt(i)), charsAndCounts.get(wordIgnoreCase.charAt(i)) + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordIgnoreCase.length(); i++) {
            if (charsAndCounts.get(wordIgnoreCase.charAt(i)) > 1) {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }
        return sb.toString();
    }
}
