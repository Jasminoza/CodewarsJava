package Kyu8;

/**
 * Alex just got a new hula hoop, he loves it but feels discouraged because his little brother is better than him.
 * <p>
 * Write a program where Alex can input (n) how many times the hoop goes round and it will return him an encouraging message :)
 * <p>
 * If Alex gets 10 or more hoops, return the string "Great, now move on to tricks".
 * If he doesn't get 10 hoops, return the string "Keep at it until you get it".
 */

public class KeepUpTheHoop {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hoopCount(n));
        n = 7;
        System.out.println(hoopCount(n));
    }

    public static String hoopCount(int n) {
        return (n >= 10 ? "Great, now move on to tricks" : "Keep at it until you get it");
    }
}
