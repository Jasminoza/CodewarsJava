package Kyu7;

import java.util.ArrayList;
import java.util.List;

public class Testing123 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("a");
        lines.add("b");
        lines.add("c");
        System.out.println(number(lines).toString()); // [1: a, 2: b, 3: c]
    }

    public static List<String> number(List<String> lines) {
        for (int x = 0; x < lines.size(); x++) {
            lines.set(x, x + 1 + ": " + lines.get(x));
        }
        return lines;
    }
}