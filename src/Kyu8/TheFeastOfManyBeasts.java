package Kyu8;

/**
 * All of the animals are having a feast! Each animal is bringing one dish.
 * There is just one rule: the dish must start and end with the same letters
 * as the animal's name. For example, the great blue heron is bringing garlic
 * naan and the chickadee is bringing chocolate cake.
 * <p>
 * Write a function feast that takes the animal's name and dish as arguments
 * and returns true or false to indicate whether the beast is allowed to bring
 * the dish to the feast.
 * <p>
 * Assume that beast and dish are always lowercase strings, and that each has
 * at least two letters. beast and dish may contain hyphens and spaces, but
 * these will not appear at the beginning or end of the string. They will
 * not contain numerals.
 */


public class TheFeastOfManyBeasts {
    public static void main(String[] args) {
        String beast = "great blue heron";
        String dish = "garlic nann";
        System.out.println(feast(beast, dish));//true
        beast = "chickadee";
        dish = "chocolate cake";
        System.out.println(feast(beast, dish));//true
        beast = "brown bear";
        dish = "bear claw";
        System.out.println(feast(beast, dish));//false
    }

    public static boolean feast(String beast, String dish) {
        return (beast.substring(0, 1).equals(dish.substring(0, 1)) && beast.substring(beast.length() - 1).equals(dish.substring(dish.length() - 1)));
    }
}

