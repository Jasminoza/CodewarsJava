package Kyu8;

import java.util.Arrays;

/**
 * I have a cat and a dog.
 * <p>
 * I got them at the same time as kitten/puppy. That was humanYears years ago.
 * <p>
 * Return their respective ages now as [humanYears,catYears,dogYears]
 * <p>
 * NOTES:
 * <p>
 * humanYears >= 1
 * humanYears are whole numbers only
 * Cat Years
 * 15 cat years for first year
 * +9 cat years for second year
 * +4 cat years for each year after that
 * Dog Years
 * 15 dog years for first year
 * +9 dog years for second year
 * +5 dog years for each year after that
 */
public class CatYearsDogYears {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(i))); // 1, 15, 15
        i = 10;
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(i))); // 10, 56, 64

    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] years = new int[3];

        years[0] = humanYears;

        switch (years[0]) {
            case 1:
                years[1] = 15;
                years[2] = 15;
                break;

            case 2:
                years[1] = 15 + 9;
                years[2] = 15 + 9;
                break;

            default:
                years[1] = 15 + 9 + 4 * (humanYears - 2);
                years[2] = 15 + 9 + 5 * (humanYears - 2);
        }

        return years;
    }
}
