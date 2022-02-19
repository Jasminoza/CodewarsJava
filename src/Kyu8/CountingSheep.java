package Kyu8;

import java.util.Arrays;

public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        System.out.println(countSheeps(array1)); // 17
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        String[] arr = new String[arrayOfSheeps.length];
        int shipCounter = 0;
        for (int x = 0; x < arrayOfSheeps.length; x++) {
            arr[x] = "" + arrayOfSheeps[x];
        }

        for (int x = 0; x < arr.length; x++) {
            if (arr[x].contains("true")) {
                shipCounter++;
            }
        }
        return shipCounter;
    }
}
