package Kyu7;

public class Grasshopper {

    public static void main(String[] args) {
        int a, b, c;
        a = 95;
        b = 90;
        c = 93;
        System.out.println(getGrade(a, b, c)); //should be A
        a = 100;
        b = 85;
        c = 86;
        System.out.println(getGrade(a, b, c)); //should be A
        a = 70;
        b = 70;
        c = 100;
        System.out.println(getGrade(a, b, c)); //should be B
        c = 70;
        System.out.println(getGrade(a, b, c)); //should be C
    }

    public static char getGrade(int s1, int s2, int s3) {
        int avgValue = (s1 + s2 + s3) / 3;

        if (avgValue < 60) {
            return 'F';
        }
        if (avgValue < 70) {
            return 'D';
        }
        if (avgValue < 80) {
            return 'C';
        }
        if (avgValue < 90) {
            return 'B';
        }
        if (avgValue <= 100) {
            return 'A';
        }
        return 'X';
    }
}