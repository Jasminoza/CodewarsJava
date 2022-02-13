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
        System.out.println(solveSuperMarketQueue(customers5, n));// should be 10.
        System.out.println(getMaxTillTime(n, customers5));
    }

    public static int solveSuperMarketQueue(int[] customers, int numberOfTills) {

        if (customers.length == 0) {
            return 0;
        }

        if (numberOfTills == 1) {
            return Arrays.stream(customers).sum();
        }

        int[][] tills = createTills(customers,numberOfTills);

        for (int i = numberOfTills; i < customers.length; i++) {
            int minTill = getIndexOfMinTill(tills);
            tills[minTill][i] = customers[i];
        }
        return getMaxTillTime(tills);
    }

    public static int [][] createTills(int [] customers, int numberOfTills){
        int[][] tills = new int[numberOfTills][customers.length];
        for(int i = 0;i<numberOfTills;i++){
            tills[i][i] = customers[i];
        }
        return tills;
    }

    public static int getIndexOfMinTill(int[][] tills) {
        int minTillIndex = 0;
        int minSum = Arrays.stream(tills[0]).sum();

        for (int i = 1; i < tills.length; i++) {
            int sum =  Arrays.stream(tills[i]).sum();
            if (minSum > sum) {
                minSum = sum;
                minTillIndex = i;
            }
        }
        return minTillIndex;
    }

    public static int getMaxTillTime(int[][] tills) {
        int maxTillTime = 0;

        for (int i = 0; i < tills.length; i++) {
            int tillTime = Arrays.stream(tills[i]).sum();
            if (tillTime > maxTillTime) {
                maxTillTime = tillTime;
            }
        }
        return maxTillTime;
    }

    public static int getMaxTillTime(int tillNumbers, int[] customers){
        int[] tills = new int [tillNumbers];
        for(int i=0;i<tillNumbers;i++){
            tills[i]=customers[i];
        }
        for (int i=tillNumbers;i<customers.length;i++){
            int indexOfMinTill = getMinTill(tills);
           tills[indexOfMinTill]+=customers[i];
        }
        return getMaxTill(tills);
    }

    public static int getMinTill(int[] tills){
        int minTill=tills[0];
        int indexOfMinTill=0;
        for(int j=1;j<tills.length;j++){
            if(tills[j]<minTill){
                minTill=tills[j];
                indexOfMinTill=j;
            }
        }
        return indexOfMinTill;
    }

    public static int getMaxTill(int[] tills){
        int maxTill=tills[0];
        for(int j=1;j<tills.length;j++){
            if(tills[j]>maxTill){
                maxTill=tills[j];
            }
        }
        return maxTill;
    }

}