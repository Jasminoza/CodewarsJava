package Kyu7;

public class ReverseWords {
    public static void main(String[] args) {
        String original = "ehT kciuq nworb xof spmuj revo eht yzal .god";
        System.out.println(reverseWords(original));
        original = "      ";
        System.out.println(reverseWords(original));
    }

    public static String reverseWords(final String original) {

        String[] arr = original.split(" ");

        if (arr.length == 0) {
            return original;
        }

        String[] reversed = new String[arr.length];
        String revStr = "";

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = revOneWord(arr[i]);
        }

        for (int j = 0; j < reversed.length; j++) {
            if (j != reversed.length - 1) {
                revStr = revStr + reversed[j] + " ";
            } else {
                revStr = revStr + reversed[j];
            }
        }
        return revStr.trim();
    }

    public static String revOneWord(String word) {
        String revWord = "";
        for (int x = word.length() - 1; x >= 0; x--) {
            revWord = revWord + word.charAt(x);
        }
        return revWord;
    }

}

