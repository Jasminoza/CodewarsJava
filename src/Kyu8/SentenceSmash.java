package Kyu8;

/**
 * Write a function that takes an array of words and smashes them together
 * into a sentence and returns the sentence. You can ignore any need to
 * sanitize words or add punctuation, but you should add spaces between
 * each word. Be careful, there shouldn't be a space at the beginning
 * or the end of the sentence!
 * <p>
 * Example
 * ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
 */

public class SentenceSmash {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "this", "is", "great"};
        System.out.println(smash(words));
        String[] words2 = {"Bilal", "Djaghout" };
        System.out.println(smash(words2));
    }

    public static String smash(String... words) {
        String answer = "";
        if (words.length == 0) {
            return answer;
        }

        for (int x = 0; x < words.length; x++) {
            if (x == words.length - 1) {
                answer = answer + words[x];
                return answer;
            }
            answer = answer + words[x] + " ";
        }
        return answer;
    }

}
