package Kyu7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TwoToOne {

    public static void main(String[] args) {
        String s1 = "xyaabbbccccdefww";
        String s2 = "xxxxyyyyabklmopq";
        System.out.println(longest(s1, s2).equals("abcdefklmopqwxy"));
        String s3 = "abcdefghijklmnopqrstuvwxyz";
        String s4 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(longest(s3, s4).equals("abcdefghijklmnopqrstuvwxyz"));
    }

    public static String longest(String s1, String s2) {
        String s3 = s1 + s2;
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < s3.length(); i++) {
            if (!arr.contains(s3.charAt(i))) {
                arr.add(s3.charAt(i));
            }
        }

        return arr.stream()
                .sorted(Comparator.comparingInt(a -> a))
                .map(Object::toString)
                .collect(Collectors.joining(""));
    }
}
