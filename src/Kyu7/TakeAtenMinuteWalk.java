package Kyu7;

/**
 * You live in the city of Cartesia where all roads are laid out in a perfect grid.
 * You arrived ten minutes too early to an appointment, so you decided to take the
 * opportunity to go for a short walk. The city provides its citizens with a Walk
 * Generating App on their phones -- everytime you press the button it sends you an
 * array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']).
 * You always walk only a single block for each letter (direction) and you know it takes
 * you one minute to traverse one city block, so create a function that will return true
 * if the walk the app gives you will take you exactly ten minutes (you don't want to be
 * early or late!) and will, of course, return you to your starting point. Return false
 * otherwise.
 */

public class TakeAtenMinuteWalk {


    public static void main(String[] args) {
        char[] walking = {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
        System.out.println(isValid(walking)); // true
        char[] walking2 = {'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'};
        System.out.println(isValid(walking2));// false
        char[] walking3 = {'w'};
        System.out.println(isValid(walking3)); //false
        char[] walking4 = {'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
        System.out.println(isValid(walking4)); //false

    }

    public static boolean isValid(char[] walk) {
        boolean samePoint = true;
        int x = 0;
        int y = 0;

        if (walk.length != 10) {
            return false;
        }

        for (int step = 0; step < walk.length; step++) {
            switch (walk[step]) {
                case 'n':
                    y += 1;
                    break;
                case 's':
                    y -= 1;
                    break;
                case 'w':
                    x -= 1;
                    break;
                case 'e':
                    x += 1;
                    break;
            }
        }
        return samePoint = (x == 0 && y == 0);
    }
}