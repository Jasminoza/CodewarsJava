package Kyu6;

import java.util.LinkedHashMap;

/**
 * Given a string of words, you need to find the highest scoring word.
 * <p>
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 * <p>
 * You need to return the highest scoring word as a string.
 * <p>
 * If two words score the same, return the word that appears earliest in the original string.
 * <p>
 * All letters will be lowercase and all inputs will be valid.
 */

public class HighestScoringWord {

    public static void main(String[] args) {
        String str = "man i need a taxi up to ubud";
        System.out.println(high(str)); // taxi
        str = "what time are we climbing up to the volcano";
        System.out.println(high(str)); // volcano
        str = "take me to semynak";
        System.out.println(high(str)); // semynak
        str = "aa b";
        System.out.println(high(str)); // aa
        str = "b aa";
        System.out.println(high(str)); // b

    }

    public static String high(String s) {

        String[] strings = s.split(" ");
        LinkedHashMap<String, Integer> wordsAndScores = new LinkedHashMap<>();

        for (String string : strings) {
            wordsAndScores.put(string, wordScore(string));
        }

        int max = Integer.MIN_VALUE;
        for (String key : wordsAndScores.keySet()) {
            if (wordsAndScores.get(key) > max) {
                max = wordsAndScores.get(key);
            }
        }

        for (var set : wordsAndScores.entrySet()) {
            if (set.getValue() == max) {
                return set.getKey();
            }
        }
        return "ERROR";
    }

    public static int wordScore(String str) {
        int startCount = 'a'; //97

        int strScore = 0;
        for (int i = 0; i < str.length(); i++) {
            strScore += (int) str.charAt(i) - startCount + 1;
        }
        return strScore;
    }

}
