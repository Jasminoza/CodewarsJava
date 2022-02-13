package Kyu7;

import java.util.Arrays;

/**
 * There is a queue for the self-checkout tills at the supermarket. Your task is write
 * a function to calculate the total time required for all the customers to check out!
 * <
 * input
 * customers: an array of positive integers representing the queue. Each integer represents
 * a customer, and its value is the amount of time they require to check out.
 * n: a positive integer, the number of checkout tills.
 * <p>
 * output
 * The function should return an integer, the total time required.
 * <p>
 * Clarifications
 * There is only ONE queue serving many tills, and
 * The order of the queue NEVER changes, and
 * The front person in the queue (i.e. the first element in the array/list) proceeds to a till as soon as it becomes free.
 * <p>
 * N.B. You should assume that all the test input will be valid, as specified above.
 */

public class TheSupermarketQueue {

    public static void main(String[] args) {
//        int[] customers1 = {2, 2, 3, 3, 4, 4};
        int n = 2;
//        System.out.println(solveSuperMarketQueue(customers1, n));// should be 9.
//        int[] customers2 = {};
//        n = 1;
//        System.out.println(solveSuperMarketQueue(customers2, n));// should be 0.
//        int[] customers3 = {1, 2, 3, 4, 5};
//        System.out.println(solveSuperMarketQueue(customers3, n));// should be 15.
//        n = 2;
//        int[] customers4 = {1, 3, 3, 4, 2, 1, 7, 2, 3, 4};
//        System.out.println(solveSuperMarketQueue(customers4, n));// should be 16.
        int[] customers5 = {2, 6, 3, 4, 2, 5, 2, 4, 2, 5, 7, 7};
        n = 5;
        System.out.println(solveSuperMarketQueue(customers5, n));// should be 13.
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {

        if (customers.length == 0) {
            return 0;
        }

        if (n == 1) {
            return Arrays.stream(customers).sum();
        }

        int[][] tills = new int[n][customers.length];

        for(int i=0;i<n;i++){
            tills[i][0]=customers[i];
        }

        for (int y = n; y < customers.length; y++) {
            int minTill = getIndexOfMinTill(tills);
            tills[minTill][y] = customers[y];
        }
        return getMaxTillTime(tills);
    }

    public static int getIndexOfMinTill(int[][] tills) {
        int minTill = 0;
        int minSumm = tills[0][0];

        for (int y = 0; y < tills.length; y++) {
            int summ = 0;
            for (int x = 0; x < tills[0].length; x++) {
                summ += tills[y][x];
            }
            if (minSumm > summ) {
                minSumm = summ;
                minTill = y;
            }

        }
        return minTill;
    }

    public static int getMaxTillTime(int[][] tills) {
        int maxTillTime = 0;

        for (int x = 0; x < tills.length; x++) {
            if (Arrays.stream(tills[x]).sum() > maxTillTime) {
                maxTillTime = Arrays.stream(tills[x]).sum();
            }
        }
        return maxTillTime;
    }

}