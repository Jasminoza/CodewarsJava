package Kyu7;

import com.sun.source.tree.BreakTree;

public class ReversedStrings {

    public static void main(String[] args) {
        String str = "world";
        System.out.println(solution(str));
    }


    public static String solution(String str) {
        String newWord = "";
        for (int x = str.length(); x > 0; x--) {
            newWord += str.substring(x - 1, x);
        }
        return newWord;
    }


}
