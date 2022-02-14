package Kyu7;

public class StringEndsWith {
    public static void main(String[] args) {
        String str = "abc";
        String ending = "bc";
        System.out.println(solution(str, ending));
        ending = "d";
        System.out.println(solution(str, ending));
    }

    public static boolean solution(String str, String ending) {
        if (ending.length() < str.length()) return false;
        return str.substring(str.length() - ending.length()).equals(ending);
    }

}
