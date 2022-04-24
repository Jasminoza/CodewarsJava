package Kyu8;

public class ReduceButGrow {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(grow(nums)); // 24
    }

    public static int grow(int[] x) {
        int multiply = 1;
        for (int i : x) {
            multiply *= i;
        }
        return multiply;

    }
}

