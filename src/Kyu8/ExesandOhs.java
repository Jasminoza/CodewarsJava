package Kyu8;

public class ExesandOhs {
    public static void main(String[] args) {
        String a = "xxxooo";
        System.out.println(getXO(a));
    }

    public static boolean getXO(String str) {
        str = str.toLowerCase();
        int x = str.length() - str.replaceAll("x", "").length();
        int o = str.length() - str.replaceAll("o", "").length();
        return (x == o);
    }
}
