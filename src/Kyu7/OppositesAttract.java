package Kyu7;

/**
 * Timmy & Sarah think they are in love, but around where they live, they will only know
 * once they pick a flower each. If one of the flowers has an even number of petals and
 * the other has an odd number of petals it means they are in love.
 * Write a function that will take the number of petals of each flower
 * and return true if they are in love and false if they aren't.
 */

public class OppositesAttract {

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        System.out.println(isLove(a, b));
        a = 2;
        b = 2;
        System.out.println(isLove(a, b));
        a = 1;
        b = 1;
        System.out.println(isLove(a, b));
        a = 0;
        b = 1;
        System.out.println(isLove(a, b));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        boolean isInLove = false;
        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0)) {
            isInLove = true;
        }
        return isInLove;
    }
}
