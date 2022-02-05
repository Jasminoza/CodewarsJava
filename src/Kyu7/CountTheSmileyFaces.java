package Kyu7;

/**
 * Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
 * <p>
 * Rules for a smiling face:
 * <p>
 * Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
 * A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
 * Every smiling face must have a smiling mouth that should be marked with either ) or D
 * No additional characters are allowed except for those mentioned.
 * <p>
 * Valid smiley face examples: :) :D ;-D :~)
 * Invalid smiley faces: ;( :> :} :]
 */


import java.util.*;

public class CountTheSmileyFaces {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":D");
        a.add(":-}");
        a.add(":-()"); // should return 2;
        System.out.println(countSmileys(a));
        List<String> b = new ArrayList<String>();
        b.add(";D");
        b.add(":-(");
        b.add(":-)");
        b.add(";~)"); // should return 3;
        System.out.println(countSmileys(b));
        List<String> c = new ArrayList<String>();
        c.add(";]");
        c.add(":[");
        c.add(":$");
        c.add(";-D"); // should return 1;
        System.out.println(countSmileys(c));
    }

    public static int countSmileys(List<String> arr) {
        int count = 0;
        int arrLength = arr.size();
        if (arr.isEmpty()) {
            return 0;
        }
        for (int x = 0; x < arrLength; x++) {
            arr.set(x, arr.get(x).replaceFirst("[;:]", "A"));
            arr.set(x, arr.get(x).replaceFirst("[-~]", "B"));
            arr.set(x, arr.get(x).replaceFirst("[)D]", "C"));

            if (arr.get(x).equals("ABC") || arr.get(x).equals("AC")) {
                count++;
            }
        }
        return count;
    }
}
