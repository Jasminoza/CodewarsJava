package Kyu7;

import java.util.ArrayList;
import java.util.List;

public class OnesAndZeros {

    public static void main(String[] args) {
        List<Integer> binary = new ArrayList<>();
        binary.add(1);
        binary.add(0);
        binary.add(1);
        binary.add(1);
        System.out.println(ConvertBinaryArrayToInt(binary));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String binAsStr = "";

        for (int x = 0; x < binary.size(); x++) {
            binAsStr += binary.get(x);
        }
        System.out.println(Character.valueOf(binAsStr));

        return 1;
    }
}
