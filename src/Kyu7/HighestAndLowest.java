package Kyu7;

import java.util.Arrays;

public class HighestAndLowest {

    public static void main(String[] args) {
        String txt = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(highAndLow(txt));
        txt = "1 2 3 4 5";
        System.out.println(highAndLow(txt));
        txt = "1 2 -3 4 5";
        System.out.println(highAndLow(txt));
        txt = "1 9 3 4 -5";
        System.out.println(highAndLow(txt));

    }

    public static String highAndLow(String numbers) {
        String answer = ""; int max = 0; int min = 0;
        String[] strArr = numbers.split(" ");
        int[] numbersArr = new int[strArr.length];
        for (int x = 0; x < strArr.length; x++) {
            numbersArr[x] = Integer.parseInt(strArr[x]);
        }
        return answer = "" + Arrays.stream(numbersArr).max().getAsInt() + " " + Arrays.stream(numbersArr).min().getAsInt();
    }
}
