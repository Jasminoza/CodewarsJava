package Kyu7;

/**
 * Trolls are attacking your comment section!
 * <p>
 * A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
 * <p>
 * Your task is to write a function that takes a string and return a new string with all vowels removed.
 * <p>
 * For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
 * <p>
 * Note: for this kata y isn't considered a vowel.
 */

public class DisemvowelTrolls {
    public static void main(String[] args) {
        String str = "This website is for losers LOL!";
        System.out.println(disemvowel(str)); //Ths wbst s fr lsrs LL!
                                             //Yr wrtng s mng th wrst 'v vr rd
        str = "No offense but,\nYour writing is among the worst I've ever read";
        System.out.println(disemvowel(str));//N ffns bt,
        str = "What are you, a communist?";
        System.out.println(disemvowel(str));//Wht r y,  cmmnst?
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[euioaEUIOA]", "");
    }
}
