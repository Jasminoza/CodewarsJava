package Kyu8;

public class VowelCount {
    public static void main(String[] args) {
        String a = "abracadabra";
        System.out.println(getCount(a));
    }

    public static int getCount(String str) {
        int vowelCount = 0;
            for (int x = 0; x < str.length(); x++){
               int z = (str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i' || str.charAt(x) == 'o' || str.charAt(x) == 'u'? vowelCount++ : vowelCount);
            }
        return vowelCount;
    }
}
