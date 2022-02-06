package Kyu7;

import java.util.Arrays;

/**
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 * It’s guaranteed that array contains at least 3 numbers.
 * The tests contain some very huge arrays, so think about performance.
 */


public class FindTheUiqueNumber {
    public static void main(String[] args) {
        double[] a = {0, 1, 0};
        System.out.println(findUniq(a)); // should be 1.0.
        double[] b = {1, 1, 1, 2, 1, 1};
        System.out.println(findUniq(b)); // should be 2.0.
        double[] c = {1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 1, 1}; //should be 2.0.
        System.out.println(findUniq(c));
    }

    public static double findUniq(double arr[]) {
        double firstNum = arr[0];
        int firstNumCount = 0;
        double secondNum = -999;
        int secondNumCount = 0;
        double thirdNum = -999;
        int thirdNumCount = 0;

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == firstNum) {
                firstNumCount++;
            }
            if (arr[x] != firstNum && arr[x] != secondNum && arr[x] != thirdNum && secondNum == -999) {
                secondNum = arr[x];
            }
            if (arr[x] == secondNum) {
                secondNumCount++;
            }
            if (arr[x] != firstNum && arr[x] != secondNum) {
                thirdNum = arr[x];
            }
            if (arr[x] == thirdNum) {
                thirdNumCount++;
            }
        }
        if (firstNumCount == 1) {
            return firstNum;
        }
        if (secondNumCount == 1) {
            return secondNum;
        }
        return thirdNum;
    }
}
