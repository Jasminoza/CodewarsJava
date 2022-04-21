package Kyu8;

/**
 * Create a function which answers the question "Are you playing banjo?".
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!
 *
 * The function takes a name as its only argument, and returns one of the following strings:
 *
 * name + " plays banjo"
 * name + " does not play banjo"
 * Names given are always valid strings.
 */

public class AreYouPlayingBanjo {

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Martin"));
        System.out.println(areYouPlayingBanjo("Rikke"));
        System.out.println(areYouPlayingBanjo("rolf"));
    }

    public static String areYouPlayingBanjo(String name) {
        if (name.charAt(0) == 'R' || name.charAt(0) == 'r') {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
}
