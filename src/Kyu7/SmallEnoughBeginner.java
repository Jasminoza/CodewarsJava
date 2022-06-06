package Kyu7;

import java.util.Arrays;

public class SmallEnoughBeginner {

    public static void main(String[] args) {
        System.out.println(smallEnough(new int[]{66, 101}, 200)); //true
        System.out.println(smallEnough(new int[]{ 78, 117, 110, 99, 104, 117, 107, 115 }, 100)); //false
        System.out.println(smallEnough(new int[]{ 101, 45, 75, 105, 99, 107 }, 107)); //true
        System.out.println(smallEnough(new int[]{ 80, 117, 115, 104, 45, 85, 112, 115 }, 120)); //true
    }

    public static boolean smallEnough(int[] a, int limit)
    {
        return Arrays.stream(a).allMatch(item -> (limit - item) >= 0);
    }
}
