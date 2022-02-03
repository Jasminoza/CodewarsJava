package Kyu8;

public class FakeBinary {
    public static void main(String[] args) {
        String a = "45385593107843568";
        System.out.println(fakeBin(a));
        a = "509321967506747";
        System.out.println(fakeBin(a));
    }

    public static String fakeBin(String numberString) {
        String answer = "";
        int digit;
        for (int x = 0; x < numberString.length(); x++) {
            digit = Integer.parseInt(numberString.substring(x, x + 1));
            if (digit < 5) {
                answer = answer + "0";
            } else {
                answer = answer + "1";
            }
        }
        return answer;
    }
}
